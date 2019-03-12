/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import GestionUtilisateur.PorteurOffre;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 5151882
 */
@Stateless
public class PorteurOffreFacade extends AbstractFacade<PorteurOffre> implements PorteurOffreFacadeLocal {

    @PersistenceContext(unitName = "HMP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PorteurOffreFacade() {
        super(PorteurOffre.class);
    }

    @Override
    public void creerPO() {
      PorteurOffre c = new PorteurOffre();
        c.setNom("Madranges");
        c.setPrenom("Manon");
        c.setMail("anas.m@gmail.com");
        c.setMdp("123");
        c.setTelephone("0600000000");
        c.setDateCreationCompte(new Date());
        em.persist(c);
    }
    
    
}
