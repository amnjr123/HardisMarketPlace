/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDevis;

import Enum.StatutDevis;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author 5151882
 */
@Entity
public class Devis implements Serializable {
//Attributs
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private StatutDevis statut;

    public StatutDevis getStatut() {
        return statut;
    }

    public void setStatut(StatutDevis statut) {
        this.statut = statut;
    }

    private String motifRefus;

    public String getMotifRefus() {
        return motifRefus;
    }

    public void setMotifRefus(String motifRefus) {
        this.motifRefus = motifRefus;
    }

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreation;

    public Date getDate() {
        return dateCreation;
    }

    public void setDate(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    private Float montant;

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    private String commentaireClient;

    public String getCommentaireClient() {
        return commentaireClient;
    }

    public void setCommentaireClient(String commentaireClient) {
        this.commentaireClient = commentaireClient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devis)) {
            return false;
        }
        Devis other = (Devis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GestionDevis.Devis[ id=" + id + " ]";
    }
    
}
