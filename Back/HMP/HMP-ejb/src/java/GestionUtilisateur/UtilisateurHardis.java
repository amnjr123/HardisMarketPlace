/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUtilisateur;

import Enum.ProfilTechnique;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(name = "id")
public class UtilisateurHardis extends Utilisateur implements Serializable {
//Clés étrangères 
    @OneToMany(mappedBy = "utilisateurHardis")
    private List<CV> cVs;

    public List<CV> getcVs() {
        return cVs;
    }

    public void setcVs(List<CV> cVs) {
        this.cVs = cVs;
    }
    
    @ManyToOne
    private Agence agence;

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
    
    @OneToMany(mappedBy = "utilisateurHardis")
    private List<Disponibilite> disponibilites;

    public List<Disponibilite> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(List<Disponibilite> disponibilites) {
        this.disponibilites = disponibilites;
    }
    
//Attributs
    
    public ProfilTechnique getProfilTechnique() {
        return profilTechnique;
    }

    public void setProfilTechnique(ProfilTechnique profilTechnique) {
        this.profilTechnique = profilTechnique;
    }

    private ProfilTechnique profilTechnique;

    public ProfilTechnique getString() {
        return profilTechnique;
    }

    public void setString(ProfilTechnique profilTechnique) {
        this.profilTechnique = profilTechnique;
    }

    private Boolean actifInactif;

    public Boolean getActifInactif() {
        return actifInactif;
    }

    public void setActifInactif(Boolean actifInactif) {
        this.actifInactif = actifInactif;
    }
    
}
