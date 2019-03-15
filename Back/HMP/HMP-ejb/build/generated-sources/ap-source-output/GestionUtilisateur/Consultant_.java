package GestionUtilisateur;

import GestionCatalogue.Offre;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(Consultant.class)
public class Consultant_ extends UtilisateurHardis_ {

    public static volatile SingularAttribute<Consultant, Float> plafondDelegation;
    public static volatile ListAttribute<Consultant, Offre> offres;

}