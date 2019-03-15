package GestionDevis;

import Enum.TypeCommunication;
import GestionDevis.Devis;
import GestionUtilisateur.Client;
import GestionUtilisateur.UtilisateurHardis;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(Communication.class)
public class Communication_ { 

    public static volatile SingularAttribute<Communication, Date> dateEnvoi;
    public static volatile SingularAttribute<Communication, UtilisateurHardis> utilisateurHardis;
    public static volatile SingularAttribute<Communication, Client> client;
    public static volatile SingularAttribute<Communication, Long> id;
    public static volatile SingularAttribute<Communication, String> contenu;
    public static volatile SingularAttribute<Communication, Devis> devis;
    public static volatile SingularAttribute<Communication, TypeCommunication> typeCommunication;

}