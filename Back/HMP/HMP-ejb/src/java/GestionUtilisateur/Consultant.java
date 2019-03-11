/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUtilisateur;

import GestionCatalogue.Offre;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 *
 * @author 5151882
 */
@Entity
public class Consultant extends UtilisateurHardis implements Serializable {

    @ManyToMany
    private List<Offre> offres;

    public List<Offre> getOffres() {
        return offres;
    }

    public void setOffres(List<Offre> offres) {
        this.offres = offres;
    }

 

    @OneToMany
    private List<CV> listCV;

    public List<CV> getListCV() {
        return listCV;
    }

    public void setListCV(List<CV> listCV) {
        this.listCV = listCV;
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
