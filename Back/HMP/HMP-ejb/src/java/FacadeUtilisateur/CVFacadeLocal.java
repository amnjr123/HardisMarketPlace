/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.CV;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author 5151882
 */
@Local
public interface CVFacadeLocal {

    void create(CV cV);

    void edit(CV cV);

    void remove(CV cV);

    CV find(Object id);

    List<CV> findAll();

    List<CV> findRange(int[] range);

    int count();

    List<CV> rechercheCV();

    CV creerCV(String chemin);

    CV modifierCV(CV cv, String chemin);

    CV supprimerCV(CV cv);

    CV rechercheCV(long id);
    
}
