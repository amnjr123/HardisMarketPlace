package GestionUtilisateur;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> mail;
    public static volatile SingularAttribute<Utilisateur, String> mdp;
    public static volatile SingularAttribute<Utilisateur, String> dtype;
    public static volatile SingularAttribute<Utilisateur, String> telephone;
    public static volatile SingularAttribute<Utilisateur, Long> id;
    public static volatile SingularAttribute<Utilisateur, String> nom;
    public static volatile SingularAttribute<Utilisateur, String> prenom;
    public static volatile SingularAttribute<Utilisateur, Date> dateCreationCompte;

}