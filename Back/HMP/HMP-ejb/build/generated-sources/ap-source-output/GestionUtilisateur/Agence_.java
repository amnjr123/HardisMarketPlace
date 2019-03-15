package GestionUtilisateur;

import GestionDevis.Devis;
import GestionUtilisateur.UtilisateurHardis;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(Agence.class)
public class Agence_ { 

    public static volatile SingularAttribute<Agence, String> Localisation;
    public static volatile ListAttribute<Agence, UtilisateurHardis> utilisateurHardiss;
    public static volatile SingularAttribute<Agence, Long> id;
    public static volatile ListAttribute<Agence, Devis> deviss;

}