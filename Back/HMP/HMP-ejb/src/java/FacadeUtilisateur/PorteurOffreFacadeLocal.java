/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.PorteurOffre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author pedago
 */
@Local
public interface PorteurOffreFacadeLocal {

    void create(PorteurOffre porteurOffre);

    void edit(PorteurOffre porteurOffre);

    void remove(PorteurOffre porteurOffre);

    PorteurOffre find(Object id);

    List<PorteurOffre> findAll();

    List<PorteurOffre> findRange(int[] range);

    int count();
    
}
