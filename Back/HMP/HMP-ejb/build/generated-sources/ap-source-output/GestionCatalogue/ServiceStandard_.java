package GestionCatalogue;

import GestionDevis.DevisStandard;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-14T11:16:10")
@StaticMetamodel(ServiceStandard.class)
public class ServiceStandard_ extends Service_ {

    public static volatile SingularAttribute<ServiceStandard, String> descriptionPrestation;
    public static volatile SingularAttribute<ServiceStandard, Integer> nbrJoursConsultantSenior;
    public static volatile SingularAttribute<ServiceStandard, Integer> nbrJoursConsultantJunior;
    public static volatile SingularAttribute<ServiceStandard, Integer> nbrJoursConsultantConfirme;
    public static volatile SingularAttribute<ServiceStandard, Integer> nbrHeuresAtelierEntretienPrevu;
    public static volatile ListAttribute<ServiceStandard, DevisStandard> devisStandards;
    public static volatile SingularAttribute<ServiceStandard, Integer> nbrHeuresSupportTel;

}