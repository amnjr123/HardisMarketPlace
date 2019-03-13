package SessionUtilisateur;

import FacadeUtilisateur.ClientFacadeLocal;
import FacadeUtilisateur.UtilisateurFacadeLocal;
import FacadeUtilisateur.UtilisateurHardisFacadeLocal;
import GestionUtilisateur.Client;
import GestionUtilisateur.Utilisateur;
import GestionUtilisateur.UtilisateurHardis;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class SessionMain implements SessionLocal {

    @EJB
    private UtilisateurHardisFacadeLocal utilisateurHardisFacade;

    @EJB
    private ClientFacadeLocal clientFacade;

    @EJB
    private UtilisateurFacadeLocal utilisateurFacade;

    @Override
    public Utilisateur authentification(String mail, String mdp) {
        return utilisateurFacade.authentification(mail, mdp);
    }

    @Override
    public String getTypeUser(Utilisateur utilisateur) {
        return utilisateurFacade.getDType(utilisateur);
    }

    @Override
    public Client rechercheClient(long id) {
        return clientFacade.rechercheClient(id);
    }

    @Override
    public UtilisateurHardis rechercheUtilisateurHardis(Long id) {
        return utilisateurHardisFacade.find(id);
    }
        
}
