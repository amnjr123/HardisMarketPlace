/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDevis;

import GestionCatalogue.ServiceStandard;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author 5151882
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class DevisStandard extends Devis implements Serializable {
//Clés étrangères
    @ManyToOne
    private ServiceStandard service;

    public ServiceStandard getService() {
        return service;
    }

    public void setService(ServiceStandard service) {
        this.service = service;
    }

}
