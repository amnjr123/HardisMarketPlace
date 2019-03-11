package GestionUtilisateur;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;



@Entity
public class Client extends Utilisateur implements Serializable {

    @ManyToOne
    private Entreprise entreprise;

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
    
    
}
