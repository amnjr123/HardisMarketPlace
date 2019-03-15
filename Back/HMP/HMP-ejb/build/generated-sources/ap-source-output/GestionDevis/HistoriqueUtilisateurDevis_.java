package GestionDevis;

import GestionDevis.Devis;
import GestionUtilisateur.UtilisateurHardis;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(HistoriqueUtilisateurDevis.class)
public class HistoriqueUtilisateurDevis_ { 

    public static volatile SingularAttribute<HistoriqueUtilisateurDevis, UtilisateurHardis> utilisateurHardis;
    public static volatile SingularAttribute<HistoriqueUtilisateurDevis, Date> dateDebut;
    public static volatile SingularAttribute<HistoriqueUtilisateurDevis, Long> id;
    public static volatile SingularAttribute<HistoriqueUtilisateurDevis, Date> dateFin;
    public static volatile SingularAttribute<HistoriqueUtilisateurDevis, Devis> devis;

}