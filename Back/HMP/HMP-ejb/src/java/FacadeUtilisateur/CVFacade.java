/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.CV;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 5151882
 */
@Stateless
public class CVFacade extends AbstractFacade<CV> implements CVFacadeLocal {

    @PersistenceContext(unitName = "HMP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CVFacade() {
        super(CV.class);
    }
    /*
    public CV creerCV(String localisation){
        CV a = new CV();
        a.setLocalisation(localisation);
        create(a);  
        return a;
    }
    
    public CV modifierAgence(Agence a, String localisation){
        a.setLocalisation(localisation);
        edit(a);
        return a;
    }
    
    public Agence supprimerAgence(Agence a){
        remove(a);
        return a;
    }
    
    public Agence rechercheAgence(long id){
        return find(id);
    }
    
    public List<Agence> rechercheAgence(){
        return findAll();
    }*/
    
}
