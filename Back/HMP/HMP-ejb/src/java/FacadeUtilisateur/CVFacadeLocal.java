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
 * @author pedago
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
    
}
