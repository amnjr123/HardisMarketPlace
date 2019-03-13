/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDevis;

import GestionDevis.DevisStandard;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author 5151882
 */
@Local
public interface DevisStandardFacadeLocal {

    void create(DevisStandard devisStandard);

    void edit(DevisStandard devisStandard);

    void remove(DevisStandard devisStandard);

    DevisStandard find(Object id);

    List<DevisStandard> findAll();

    List<DevisStandard> findRange(int[] range);

    int count();
    
}
