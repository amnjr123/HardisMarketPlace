/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.Client;
import GestionUtilisateur.Entreprise;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 
 */
@Stateless
public class ClientFacade extends AbstractFacade<Client> implements ClientFacadeLocal {

    @PersistenceContext(unitName = "HMP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientFacade() {
        super(Client.class);
    }

    @Override
    public Client creerClient(String nom,String prenom,String mail,String tel,String mdp, Entreprise e){
        Client c = new Client();
        c.setNom(nom);
        c.setPrenom(prenom);
        c.setMail(mail);
        c.setTelephone(tel);
        c.setMdp(mdp);
        c.setDateCreationCompte(new Date());
        c.setEntreprise(e);
        create(c);  
        return c;
    }
    
    @Override
    public Client modifierClient(Client c, String nom,String prenom,String mail,String tel,String mdp){
        c.setNom(nom);
        c.setPrenom(prenom);
        c.setMail(mail);
        c.setTelephone(tel);
        c.setMdp(mdp);
        edit(c);
        return c;
    }
    
    @Override
    public Client supprimerClient(Client c){
        remove(c);
        return c;
    }
    
    @Override
    public Client rechercheClient(long id){
        return find(id);
    }
    
    @Override
    public List<Client> rechercheClient(){
        return findAll();
    }
    
    
}
