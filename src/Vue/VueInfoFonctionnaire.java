package Vue;

import Controlleur.IControleurFonctionnaire;
import modele.IModeleFonctionnaire;

public class VueInfoFonctionnaire extends VueFonctionnaire {

    private IModeleFonctionnaire IModeleFonctionnaire;
    private IControleurFonctionnaire IControleurFonctionnaire;

    // Constructeur corrigé
    public VueInfoFonctionnaire(IModeleFonctionnaire iModele, IControleurFonctionnaire iControleurFonctionnaire) {
        this.IModeleFonctionnaire = iModele;
        this.IControleurFonctionnaire = iControleurFonctionnaire;
    }

    @Override
    public void activerVue() {
        System.out.println("Vue activée");
    }

    public void afficher(String nom, String prenom, String affectation, String grade, String specialite) {
        // Affichage des informations
        System.out.println("Les informations du Fonctionnaire:");
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Affectation: " + affectation);
        System.out.println("Grade: " + grade);
        System.out.println("Spécialité: " + specialite);
    }

    public void afficher() {
        String nom = saisirNom();
        String prenom = saisirPrenom();
        String affectation = saisirAffectation();
        String grade = saisirGrade();
        String specialite = saisirSpecialite();

        // Affichage des informations saisies
        System.out.println("Les informations saisies:");
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Affectation: " + affectation);
        System.out.println("Grade: " + grade);
        System.out.println("Spécialité: " + specialite);
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
