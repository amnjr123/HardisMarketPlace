/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeUtilisateur;

import Enum.ProfilTechnique;
import GestionCatalogue.Offre;
import GestionUtilisateur.ReferentLocal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author 5151882
 */
@Local
public interface ReferentLocalFacadeLocal {

    void create(ReferentLocal referentLocal);

    void edit(ReferentLocal referentLocal);

    void remove(ReferentLocal referentLocal);

    ReferentLocal find(Object id);

    List<ReferentLocal> findAll();

    List<ReferentLocal> findRange(int[] range);

    int count();

    ReferentLocal modifierReferentLocal(ReferentLocal rl, String nom, String prenom, String mail, String tel, String mdp, ProfilTechnique profil, Boolean actifInactif, float plafondDelegation, Offre offre);

    ReferentLocal modifierReferentLocal(ReferentLocal rl, String mail, String tel, String mdp, Boolean actifInactif);

    ReferentLocal supprimerReferentLocal(ReferentLocal rl);

    ReferentLocal rechercheReferentLocal(long id);

    List<ReferentLocal> rechercheReferentLocal();

    ReferentLocal creerReferentLocal(String nom, String prenom, String mail, String tel, String mdp, ProfilTechnique profil, Boolean actifInactif, float plafondDelegation, Offre offre);
    
}
