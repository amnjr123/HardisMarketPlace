/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDevis;

import GestionDevis.Proposition;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author 5151882
 */
@Local
public interface PropositionFacadeLocal {

    void create(Proposition proposition);

    void edit(Proposition proposition);

    void remove(Proposition proposition);

    Proposition find(Object id);

    List<Proposition> findAll();

    List<Proposition> findRange(int[] range);

    int count();
    
}
