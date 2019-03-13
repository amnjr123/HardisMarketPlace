/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDevis;

import Enum.StatutDevis;
import GestionCatalogue.ServiceNonStandard;
import GestionDevis.DevisNonStandard;
import GestionUtilisateur.Agence;
import GestionUtilisateur.ReferentLocal;
import GestionUtilisateur.UtilisateurHardis;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 5151882
 */
@Stateless
public class DevisNonStandardFacade extends AbstractFacade<DevisNonStandard> implements DevisNonStandardFacadeLocal {

    @PersistenceContext(unitName = "HMP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DevisNonStandardFacade() {
        super(DevisNonStandard.class);
    }
    
    @Override
    public DevisNonStandard creerDevisNonStandard(float montant, String commentaireClient, ServiceNonStandard serviceNonStandard, ReferentLocal rl, Agence agence){
        DevisNonStandard d = new DevisNonStandard();
        d.setStatut(StatutDevis.ReponseEnCours);
        d.setMotifRefus("");
        d.setDateCreation(new Date());
        d.setMontant(montant);
        d.setCommentaireClient(commentaireClient);
        d.setUtilisateurHardis(rl);
        d.setAgence(agence);
        create(d);  
        return d;
    }
    
    @Override
    public DevisNonStandard modifierDevisNonStandard(DevisNonStandard d, float montant){
        d.setMontant(montant);
        edit(d);
        return d;
    }
    
    @Override
    public DevisNonStandard transfererDevisNonStandard(DevisNonStandard d, UtilisateurHardis uh){
        d.setUtilisateurHardis(uh);
        edit(d);
        return d;
    }
    
    public DevisNonStandard envoyerDevisNonStandard(DevisNonStandard d){
        d.setStatut(StatutDevis.Envoye);
        d.setDateEnvoi(new Date());
        edit(d);
        return d;
    }
    
    @Override
    public DevisNonStandard validerDevisNonStandard(DevisNonStandard d){
        d.setStatut(StatutDevis.Valide);
        d.setDateReponse(new Date());
        edit(d);
        return d;
    }
    
    @Override
    public DevisNonStandard refuserDevisNonStandard(DevisNonStandard d, String motifRefus){
        d.setStatut(StatutDevis.Refuse);
        d.setMotifRefus(motifRefus);
        d.setDateReponse(new Date());
        edit(d);
        return d;
    }
    
    @Override
    public DevisNonStandard acompteDevisNonStandard(DevisNonStandard d){
        d.setStatut(StatutDevis.AcompteRegle);
        d.setDateAcompte(new Date());
        edit(d);
        return d;
    }
    
    @Override
    public DevisNonStandard supprimerDevisNonStandard(DevisNonStandard d){
        remove(d);
        return d;
    }
    
    @Override
    public DevisNonStandard rechercheDevisNonStandard(long id){
        return find(id);
    }
    
    @Override
    public List<DevisNonStandard> rechercheDevisNonStandard(){
        return findAll();
    }
    
}
