package GestionDevis;

import GestionDevis.DevisNonStandard;
import GestionUtilisateur.UtilisateurHardis;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-14T11:16:10")
@StaticMetamodel(Proposition.class)
public class Proposition_ { 

    public static volatile SingularAttribute<Proposition, Date> dateDebutValidite;
    public static volatile SingularAttribute<Proposition, UtilisateurHardis> UtilisateurHardis;
    public static volatile SingularAttribute<Proposition, String> cheminDocument;
    public static volatile SingularAttribute<Proposition, Long> id;
    public static volatile SingularAttribute<Proposition, DevisNonStandard> devisNonStandard;
    public static volatile SingularAttribute<Proposition, Date> dateFinValidite;

}