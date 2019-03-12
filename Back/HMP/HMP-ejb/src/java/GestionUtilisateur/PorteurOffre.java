/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUtilisateur;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 *
 * @author 5151882
 */
@Entity
public class PorteurOffre extends UtilisateurHardis implements Serializable {

    @ManyToOne
    private CV cv;

    public CV getCv() {
        return cv;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }
    
   @OneToMany
    private List<Disponibilite> disponibilites;


    public List<Disponibilite> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(List<Disponibilite> disponibilites) {
        this.disponibilites = disponibilites;
    }
    
    @ManyToOne
    private Agence agence;
    
    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
    
}