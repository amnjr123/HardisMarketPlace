package GestionUtilisateur;

import GestionDevis.Communication;
import GestionUtilisateur.Entreprise;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-14T11:16:10")
@StaticMetamodel(Client.class)
public class Client_ extends Utilisateur_ {

    public static volatile SingularAttribute<Client, Entreprise> entreprise;
    public static volatile ListAttribute<Client, Communication> communications;

}