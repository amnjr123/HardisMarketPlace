package GestionDevis;

import Enum.StatutDevis;
import GestionDevis.Communication;
import GestionDevis.HistoriqueUtilisateurDevis;
import GestionDevis.Intervention;
import GestionUtilisateur.Agence;
import GestionUtilisateur.UtilisateurHardis;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(Devis.class)
public class Devis_ { 

    public static volatile SingularAttribute<Devis, Date> dateEnvoi;
    public static volatile SingularAttribute<Devis, Date> dateCreation;
    public static volatile SingularAttribute<Devis, UtilisateurHardis> utilisateurHardis;
    public static volatile SingularAttribute<Devis, Date> dateAcompte;
    public static volatile SingularAttribute<Devis, String> dtype;
    public static volatile SingularAttribute<Devis, Float> montant;
    public static volatile SingularAttribute<Devis, String> motifRefus;
    public static volatile SingularAttribute<Devis, String> commentaireClient;
    public static volatile SingularAttribute<Devis, Agence> agence;
    public static volatile ListAttribute<Devis, Communication> communications;
    public static volatile ListAttribute<Devis, HistoriqueUtilisateurDevis> historiqueUtilisateurDeviss;
    public static volatile ListAttribute<Devis, Intervention> interventions;
    public static volatile SingularAttribute<Devis, Date> dateReglement;
    public static volatile SingularAttribute<Devis, Date> dateReponse;
    public static volatile SingularAttribute<Devis, Long> id;
    public static volatile SingularAttribute<Devis, StatutDevis> statut;

}