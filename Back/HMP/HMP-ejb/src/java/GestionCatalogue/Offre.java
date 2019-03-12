/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionCatalogue;

import GestionUtilisateur.Consultant;
import GestionUtilisateur.PorteurOffre;
import GestionUtilisateur.ReferentLocal;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author pedago
 */
@Entity
public class Offre implements Serializable {
//Clés étrangères
    @OneToMany(mappedBy = "offre")
    private List<ReferentLocal> referentstLocaux;

    public List<ReferentLocal> getReferentstLocaux() {
        return referentstLocaux;
    }

    public void setReferentstLocaux(List<ReferentLocal> referentstLocaux) {
        this.referentstLocaux = referentstLocaux;
    }
    
    @ManyToMany(mappedBy = "offres")
    private List<Consultant> consultants;

    public List<Consultant> getConsultants() {
        return consultants;
    }

    public void setConsultants(List<Consultant> consultants) {
        this.consultants = consultants;
    }

    @OneToOne
    private PorteurOffre po;

    public PorteurOffre getPo() {
        return po;
    }

    public void setPo(PorteurOffre po) {
        this.po = po;
    }
    
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offre)) {
            return false;
        }
        Offre other = (Offre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GestionCatalogue.Offre[ id=" + id + " ]";
    }
    
}
