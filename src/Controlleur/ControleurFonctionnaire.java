package Controlleur;

import java.util.ArrayList;
import java.util.List;
import Vue.IVueFonctionnaire;
import modele.IModeleFonctionnaire;

public class ControleurFonctionnaire implements IControleurFonctionnaire {

    private IModeleFonctionnaire iModele;
    private List<IVueFonctionnaire> iVues = new ArrayList<>();
    private IVueFonctionnaire iVue;

    public ControleurFonctionnaire(IModeleFonctionnaire iModele) {
        this.iModele = iModele;
    }

    @Override
    public void setVue(IVueFonctionnaire iVue) {
        this.iVue = iVue;
    }

    @Override
    public void ajouterVue(IVueFonctionnaire iVue) {
        if (iVue != null) {
            iVues.add(iVue);
        }
    }

    @Override
    public void gererVue() {
        for (IVueFonctionnaire vue : iVues) {
            this.setVue(vue);
            vue.activerVue();
        }
    }

    public void gererSaisieVueFonctionnaire() {
        for (IVueFonctionnaire vue : iVues) {
            if (vue != null) {
               
                String grade = vue.saisirGrade();
                String specialite = vue.saisirSpecialite();

                if (grade != null && specialite != null) {
                   
                    iModele.miseAJourDiplome(grade, specialite); 
                }
            }
        }
    }

    @Override
    public void gererSaisieVueDiplome() {
        for (IVueFonctionnaire vue : iVues) {
            if (vue != null) {
                
                String identifiant = vue.saisirIdentifiant();
                String nom = vue.saisirNom();
                String prenom = vue.saisirPrenom();
                String affectation = vue.saisirAffectation();

                if (identifiant != null && nom != null && prenom != null) {
                    
                    iModele.miseAJour(identifiant, nom, prenom , affectation); 
                }
            }
        }
    }
}
