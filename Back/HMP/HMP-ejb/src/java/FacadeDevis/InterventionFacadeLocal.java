/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDevis;

import GestionDevis.Intervention;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author 5151882
 */
@Local
public interface InterventionFacadeLocal {

    void create(Intervention intervention);

    void edit(Intervention intervention);

    void remove(Intervention intervention);

    Intervention find(Object id);

    List<Intervention> findAll();

    List<Intervention> findRange(int[] range);

    int count();
    
}
