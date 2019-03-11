/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.Agence;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author pedago
 */
@Local
public interface AgenceFacadeLocal {

    void create(Agence agence);

    void edit(Agence agence);

    void remove(Agence agence);

    Agence find(Object id);

    List<Agence> findAll();

    List<Agence> findRange(int[] range);

    int count();
    
}
