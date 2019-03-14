package GestionUtilisateur;

import Enum.ProfilTechnique;
import GestionDevis.Communication;
import GestionDevis.Devis;
import GestionDevis.HistoriqueUtilisateurDevis;
import GestionDevis.Intervention;
import GestionDevis.Proposition;
import GestionUtilisateur.Agence;
import GestionUtilisateur.CV;
import GestionUtilisateur.Disponibilite;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-14T11:16:10")
@StaticMetamodel(UtilisateurHardis.class)
public class UtilisateurHardis_ extends Utilisateur_ {

    public static volatile SingularAttribute<UtilisateurHardis, Agence> agence;
    public static volatile ListAttribute<UtilisateurHardis, CV> cVs;
    public static volatile ListAttribute<UtilisateurHardis, Communication> communications;
    public static volatile ListAttribute<UtilisateurHardis, HistoriqueUtilisateurDevis> historiqueUtilisateurDeviss;
    public static volatile ListAttribute<UtilisateurHardis, Intervention> interventions;
    public static volatile ListAttribute<UtilisateurHardis, Proposition> propositions;
    public static volatile SingularAttribute<UtilisateurHardis, Boolean> actifInactif;
    public static volatile SingularAttribute<UtilisateurHardis, ProfilTechnique> profilTechnique;
    public static volatile ListAttribute<UtilisateurHardis, Disponibilite> disponibilites;
    public static volatile ListAttribute<UtilisateurHardis, Devis> deviss;

}