package GestionUtilisateur;

import GestionUtilisateur.Entreprise;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-14T11:16:10")
@StaticMetamodel(Interlocuteur.class)
public class Interlocuteur_ { 

    public static volatile SingularAttribute<Interlocuteur, Entreprise> entreprise;
    public static volatile SingularAttribute<Interlocuteur, String> mail;
    public static volatile SingularAttribute<Interlocuteur, String> fonction;
    public static volatile SingularAttribute<Interlocuteur, String> telephone;
    public static volatile SingularAttribute<Interlocuteur, Long> id;
    public static volatile SingularAttribute<Interlocuteur, String> nom;
    public static volatile SingularAttribute<Interlocuteur, String> prenom;

}