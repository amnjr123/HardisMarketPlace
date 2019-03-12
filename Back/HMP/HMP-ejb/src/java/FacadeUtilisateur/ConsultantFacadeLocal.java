/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.Consultant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author 5151882
 */
@Local
public interface ConsultantFacadeLocal {

    void create(Consultant consultant);

    void edit(Consultant consultant);

    void remove(Consultant consultant);

    Consultant find(Object id);

    List<Consultant> findAll();

    List<Consultant> findRange(int[] range);

    int count();
    
}
