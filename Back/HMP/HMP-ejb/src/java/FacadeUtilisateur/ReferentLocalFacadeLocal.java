/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.ReferentLocal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author pedago
 */
@Local
public interface ReferentLocalFacadeLocal {

    void create(ReferentLocal referentLocal);

    void edit(ReferentLocal referentLocal);

    void remove(ReferentLocal referentLocal);

    ReferentLocal find(Object id);

    List<ReferentLocal> findAll();

    List<ReferentLocal> findRange(int[] range);

    int count();
    
}
