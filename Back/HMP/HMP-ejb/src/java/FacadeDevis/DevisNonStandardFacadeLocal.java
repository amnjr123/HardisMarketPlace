/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDevis;

import GestionDevis.DevisNonStandard;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author 5151882
 */
@Local
public interface DevisNonStandardFacadeLocal {

    void create(DevisNonStandard devisNonStandard);

    void edit(DevisNonStandard devisNonStandard);

    void remove(DevisNonStandard devisNonStandard);

    DevisNonStandard find(Object id);

    List<DevisNonStandard> findAll();

    List<DevisNonStandard> findRange(int[] range);

    int count();
    
}
