package GestionUtilisateur;

import GestionUtilisateur.Agence;
import GestionUtilisateur.Client;
import GestionUtilisateur.Interlocuteur;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(Entreprise.class)
public class Entreprise_ { 

    public static volatile SingularAttribute<Entreprise, Agence> agence;
    public static volatile ListAttribute<Entreprise, Interlocuteur> interlocuteurs;
    public static volatile SingularAttribute<Entreprise, String> adresseFacturation;
    public static volatile SingularAttribute<Entreprise, String> mdpRattachement;
    public static volatile SingularAttribute<Entreprise, Long> id;
    public static volatile SingularAttribute<Entreprise, String> nom;
    public static volatile SingularAttribute<Entreprise, String> siret;
    public static volatile ListAttribute<Entreprise, Client> employes;

}