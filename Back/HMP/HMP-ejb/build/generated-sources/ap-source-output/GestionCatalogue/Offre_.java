package GestionCatalogue;

import GestionCatalogue.Service;
import GestionUtilisateur.CV;
import GestionUtilisateur.Consultant;
import GestionUtilisateur.PorteurOffre;
import GestionUtilisateur.ReferentLocal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-15T09:41:10")
@StaticMetamodel(Offre.class)
public class Offre_ { 

    public static volatile ListAttribute<Offre, ReferentLocal> referentstLocaux;
    public static volatile ListAttribute<Offre, CV> CVs;
    public static volatile SingularAttribute<Offre, Date> dateDebutValidite;
    public static volatile ListAttribute<Offre, Consultant> consultants;
    public static volatile SingularAttribute<Offre, String> libelle;
    public static volatile ListAttribute<Offre, Service> services;
    public static volatile SingularAttribute<Offre, Long> id;
    public static volatile SingularAttribute<Offre, Date> dateFinValidite;
    public static volatile SingularAttribute<Offre, PorteurOffre> po;

}