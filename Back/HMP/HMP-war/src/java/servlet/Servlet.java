package servlet;

import GestionUtilisateur.Client;
import GestionUtilisateur.Utilisateur;
import GestionUtilisateur.UtilisateurHardis;
import SessionUtilisateur.SessionClientLocal;
import SessionUtilisateur.SessionLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @EJB
    private SessionLocal sessionMain;
    
    private final String ATT_SESSION_CLIENT = "sessionClient";
    
    private final String ATT_SESSION_HARDIS = "sessionHardis";

    private String jspClient = "/login.jsp";
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sessionHttp = request.getSession();

        String act = request.getParameter("action");
        
           if (act.equals("connexion")) {
            String login = request.getParameter("login").trim();
            String mdp = request.getParameter("password");
            Utilisateur utilisateur = sessionMain.authentification(login, mdp);

            if (utilisateur != null) {
                if(sessionMain.getTypeUser(utilisateur).equalsIgnoreCase("Client")){
                Client c = sessionMain.rechercheClient(utilisateur.getId());
                sessionHttp.setAttribute(ATT_SESSION_CLIENT, c);//Attribuer le Token
                jspClient = "/client/index.jsp";
                }else{
                    UtilisateurHardis uh = sessionMain.rechercheUtilisateurHardis(utilisateur.getId());
                    sessionHttp.setAttribute(ATT_SESSION_HARDIS, uh);//Attribuer le Token
                jspClient = "/utilisateurHardis/index.jsp";
                }       
            } else {
                jspClient = "/login.jsp";
                request.setAttribute("msgError", "Utilisateur inexistant");
            }
        }

        /*Control Deconnexion*/
        if (act.equals("deconnexion")) {
            sessionHttp.setAttribute(ATT_SESSION_CLIENT, null); //Enlever le Token
            sessionHttp.setAttribute(ATT_SESSION_HARDIS, null); //Enlever le Token
            jspClient = "/login.jsp";
        }
        /*Fin Deconnexion*/

        
        RequestDispatcher rd = getServletContext().getRequestDispatcher(jspClient);
        rd.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
