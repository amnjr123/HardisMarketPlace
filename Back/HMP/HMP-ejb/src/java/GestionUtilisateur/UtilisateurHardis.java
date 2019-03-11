/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUtilisateur;

import Enum.ProfilTechnique;
import java.io.Serializable;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class UtilisateurHardis extends Utilisateur implements Serializable {

    private ProfilTechnique string;

    public ProfilTechnique getString() {
        return string;
    }

    public void setString(ProfilTechnique string) {
        this.string = string;
    }

    private Boolean actifInactif;

    public Boolean getActifInactif() {
        return actifInactif;
    }

    public void setActifInactif(Boolean actifInactif) {
        this.actifInactif = actifInactif;
    }

    private Float plafondDelegation;

    public Float getPlafondDelegation() {
        return plafondDelegation;
    }

    public void setPlafondDelegation(Float plafondDelegation) {
        this.plafondDelegation = plafondDelegation;
    }
    
}
