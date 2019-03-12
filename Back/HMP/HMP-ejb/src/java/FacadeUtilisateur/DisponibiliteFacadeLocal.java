/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.Disponibilite;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author pedago
 */
@Local
public interface DisponibiliteFacadeLocal {

    void create(Disponibilite disponibilite);

    void edit(Disponibilite disponibilite);

    void remove(Disponibilite disponibilite);

    Disponibilite find(Object id);

    List<Disponibilite> findAll();

    List<Disponibilite> findRange(int[] range);

    int count();
    
}