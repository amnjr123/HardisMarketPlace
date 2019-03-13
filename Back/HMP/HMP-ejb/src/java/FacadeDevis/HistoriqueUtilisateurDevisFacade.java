/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDevis;

import GestionDevis.HistoriqueUtilisateurDevis;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 5151882
 */
@Stateless
public class HistoriqueUtilisateurDevisFacade extends AbstractFacade<HistoriqueUtilisateurDevis> implements HistoriqueUtilisateurDevisFacadeLocal {

    @PersistenceContext(unitName = "HMP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistoriqueUtilisateurDevisFacade() {
        super(HistoriqueUtilisateurDevis.class);
    }
    
}
