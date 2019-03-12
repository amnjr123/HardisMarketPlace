/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.CV;
import java.util.List;
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
    
    public CV creerCV(String localisation){
        CV a = new CV();
       // a.setLocalisation(localisation);
        create(a);  
        return a;
    }
    
    public CV modifierAgence(CV a, String localisation){
     //   a.setLocalisation(localisation);
        edit(a);
        return a;
    }
    
    public CV supprimerAgence(CV a){
        remove(a);
        return a;
    }
    
    public CV rechercheAgence(long id){
        return find(id);
    }
    
    public List<CV> rechercheAgence(){
        return findAll();
    }
    
}
