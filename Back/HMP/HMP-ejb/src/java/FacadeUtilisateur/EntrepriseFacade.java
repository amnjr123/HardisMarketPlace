/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.Agence;
import GestionUtilisateur.Entreprise;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 5151882
 */
@Stateless
public class EntrepriseFacade extends AbstractFacade<Entreprise> implements EntrepriseFacadeLocal {

    @PersistenceContext(unitName = "HMP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntrepriseFacade() {
        super(Entreprise.class);
    }
    @Override
    public Entreprise creerEntreprise(String nom,String siret, String adresse, String mdp,Agence a){
        Entreprise e = new Entreprise();
        e.setNom(nom);
        e.setSiret(siret);
        e.setAdresseFacturation(adresse);
        e.setMdpRattachement(mdp);
        e.setAgence(a);
        create(e);  
        return e;
    }
    
    @Override
    public Entreprise modifierEntreprise(Entreprise e, String nom,String siret, String adresse, String mdp,Agence a){
        e.setNom(nom);
        e.setSiret(siret);
        e.setAdresseFacturation(adresse);
        e.setMdpRattachement(mdp);
        e.setAgence(a);
        edit(e);
        return e;
    }
    
    @Override
    public Entreprise supprimerEntreprise(Entreprise e){
        remove(e);
        return e;
    }
    
    @Override
    public Entreprise rechercheEntreprise(long id){
        return find(id);
    }
    
    @Override
    public List<Entreprise> rechercheEntreprise(){
        return findAll();
    }
}
