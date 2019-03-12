/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUtilisateur;

import GestionCatalogue.Offre;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author 5151882
 */
@Entity
public class ReferentLocal extends UtilisateurHardis implements Serializable {

    @ManyToOne
    private Offre offre;

    public Offre getOffre() {
        return offre;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }
    
    private Float plafondDelegation;

    public Float getPlafondDelegation() {
        return plafondDelegation;
    }

    public void setPlafondDelegation(Float plafondDelegation) {
        this.plafondDelegation = plafondDelegation;
    }
     
}
