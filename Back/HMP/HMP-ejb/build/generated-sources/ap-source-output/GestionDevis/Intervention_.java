package GestionDevis;

import GestionDevis.Devis;
import GestionUtilisateur.UtilisateurHardis;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(Intervention.class)
public class Intervention_ { 

    public static volatile SingularAttribute<Intervention, Date> dateInterventionDemandee;
    public static volatile SingularAttribute<Intervention, UtilisateurHardis> UtilisateurHardis;
    public static volatile SingularAttribute<Intervention, Long> id;
    public static volatile SingularAttribute<Intervention, Devis> devis;

}