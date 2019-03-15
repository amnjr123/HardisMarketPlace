package GestionCatalogue;

import Enum.LieuIntervention;
import GestionCatalogue.Livrable;
import GestionCatalogue.Offre;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(Service.class)
public class Service_ { 

    public static volatile SingularAttribute<Service, Date> dateDebutValidite;
    public static volatile SingularAttribute<Service, LieuIntervention> lieuIntervention;
    public static volatile SingularAttribute<Service, Float> cout;
    public static volatile ListAttribute<Service, Livrable> livrables;
    public static volatile SingularAttribute<Service, String> dtype;
    public static volatile SingularAttribute<Service, Integer> delaiRelance;
    public static volatile SingularAttribute<Service, String> nom;
    public static volatile SingularAttribute<Service, Offre> offre;
    public static volatile SingularAttribute<Service, Long> ancienID;
    public static volatile SingularAttribute<Service, Boolean> fraisInclus;
    public static volatile SingularAttribute<Service, Long> id;
    public static volatile SingularAttribute<Service, String> descriptionService;
    public static volatile SingularAttribute<Service, String> conditions;
    public static volatile SingularAttribute<Service, Date> dateFinValidite;

}