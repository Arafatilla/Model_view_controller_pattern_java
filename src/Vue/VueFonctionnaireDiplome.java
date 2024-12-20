package Vue;

import modele.IModeleFonctionnaire;
import Controlleur.IControleurFonctionnaire;

public class VueFonctionnaireDiplome extends VueFonctionnaire {

    private IModeleFonctionnaire IModeleFonctionnaire;
    private IControleurFonctionnaire IControleurFonctionnaire;

    
    public VueFonctionnaireDiplome(IModeleFonctionnaire iModele, IControleurFonctionnaire iControleurFonctionnaire) {
        this.IModeleFonctionnaire = iModele;
        this.IControleurFonctionnaire = iControleurFonctionnaire;
    }

    @Override
    public void activerVue() {
        System.out.println("Vue activée");
    }

    public void afficher() {
        System.out.println("Les informations du Fonctionnaire:");
        System.out.println("Nom: " + IModeleFonctionnaire.getNom());
        System.out.println("Prénom: " + IModeleFonctionnaire.getPrenom());
        System.out.println("Affectation: " + IModeleFonctionnaire.getAffecation());
        System.out.println("Grade: " + IModeleFonctionnaire.getGradeDiplome());      // Utilisation correcte du modele 
        System.out.println("Spécialité: " + IModeleFonctionnaire.getSpecialiteDiplome());
    }


    public void saisir() {
        String nom = saisirNom();
        String prenom = saisirPrenom();
        String affectation = saisirAffectation();
        String grade = saisirGrade();
        String specialite = saisirSpecialite();
    }

    @Override
    public void actualiser() {
        this.afficher();
    }
}
