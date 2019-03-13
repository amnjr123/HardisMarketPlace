/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDevis;

import GestionDevis.Devis;
import GestionDevis.HistoriqueUtilisateurDevis;
import GestionUtilisateur.UtilisateurHardis;
import java.util.Date;
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
    
    //Méthode à utiliser lors de l'affectation du tout premier employé sur le devis
    @Override
    public HistoriqueUtilisateurDevis creerPremierHistoriqueUtilisateurDevis(Devis devis, UtilisateurHardis uh){
        HistoriqueUtilisateurDevis historique = new HistoriqueUtilisateurDevis();
        historique.setDevis(devis);
        historique.setUtilisateurHardis(uh);
        historique.setDateDebut(new Date());
        historique.setDateFin(new Date(Long.MAX_VALUE));
        create(historique);  
        return historique;
    }
    
    //Méthode à utiliser lors du transfert de devis entre employés
    public HistoriqueUtilisateurDevis creerSuiteHistoriqueUtilisateurDevis(HistoriqueUtilisateurDevis ancienHistorique, UtilisateurHardis nouvelUtilisateur){
        //Création nouvel historique
        HistoriqueUtilisateurDevis nouvelHistorique = new HistoriqueUtilisateurDevis();
        //Récupération du devis
        nouvelHistorique.setDevis(ancienHistorique.getDevis());
        //Affectation du nouveau gestionnaires et de ses dates
        nouvelHistorique.setUtilisateurHardis(nouvelUtilisateur);
        nouvelHistorique.setDateDebut(new Date());
        nouvelHistorique.setDateFin(new Date(Long.MAX_VALUE));
        //Affectation date de fin de l'ancien historique
        ancienHistorique.setDateFin(new Date());
        //Mise à jour BDD
        create(nouvelHistorique);
        edit(ancienHistorique);
        return nouvelHistorique;
    }
    
}
