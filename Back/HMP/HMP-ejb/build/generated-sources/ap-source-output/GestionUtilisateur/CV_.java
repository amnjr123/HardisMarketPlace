package GestionUtilisateur;

import GestionCatalogue.Offre;
import GestionUtilisateur.UtilisateurHardis;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(CV.class)
public class CV_ { 

    public static volatile SingularAttribute<CV, String> cheminCV;
    public static volatile SingularAttribute<CV, UtilisateurHardis> utilisateurHardis;
    public static volatile SingularAttribute<CV, Long> id;
    public static volatile SingularAttribute<CV, Offre> offre;

}