package Application;

import Controlleur.ControleurFonctionnaire;
import modele.ModeleFonctionnaire;
import Vue.VueFonctionnaireDiplome;

public class App {
    public static void main(String[] args) {
        
    	
    	// Initialisation des composants
        ModeleFonctionnaire modele = new ModeleFonctionnaire();
        ControleurFonctionnaire controleur = new ControleurFonctionnaire(modele);
        VueFonctionnaireDiplome vue = new VueFonctionnaireDiplome(modele, controleur);

        //  l'ajoute des vue pour un suele controlleur 
        controleur.ajouterVue(vue);
        vue.activerVue();

        
        String identifiant = vue.saisirIdentifiant();
        String nom = vue.saisirNom();
        String prenom = vue.saisirPrenom();
        String affectation = vue.saisirAffectation();
        String grade = vue.saisirGrade();
        String specialite = vue.saisirSpecialite();

        // Mise à jour 
        
        modele.miseAJour(identifiant, nom, prenom, affectation);
        modele.miseAJourDiplome(grade, specialite);

        // Affichage des informations via la vue
        vue.afficher(); // Pas besoin de passer les paramètres, la méthode utilise le modèle directement
    }
}
