/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionCatalogue;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author 5151882
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class ServiceNonStandard extends Service implements Serializable {
    
}
