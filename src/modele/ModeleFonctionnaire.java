package modele;

import java.util.ArrayList;
import java.util.List;
import Vue.IObservateur;

public class ModeleFonctionnaire implements IModeleFonctionnaire {
    private String identifiant;
    private String nom;
    private String prenom;
    private String affectation;
    private Diplome diplome = new Diplome();
    private final List<IObservateur> observateurs = new ArrayList<>();

    @Override
    public String getIdentifiant() {
        return identifiant;
    }

    @Override
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
        notifier();
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
        notifier();
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
        notifier();
    }

    @Override
    public String getAffecation() {
        return affectation;
    }

    @Override
    public void setAffecation(String affectation) {
        this.affectation = affectation;
        notifier();
    }

    @Override
    public String getGradeDiplome() {
        return diplome.getGrade();
    }

    @Override
    public String getSpecialiteDiplome() {
        return diplome.getSpecialite();
    }

    @Override
    public void miseAJour(String identifiant, String nom, String prenom, String affectation) {
        setIdentifiant(identifiant);
        setNom(nom);
        setPrenom(prenom);
        setAffecation(affectation);
    }

    @Override
    public void miseAJourDiplome(String grade, String specialite) {
        diplome.setGrade(grade);      
        diplome.setSpecialite(specialite);
        notifier();                   
    }


    @Override
    public void ajouterObservateur(IObservateur o) {
        observateurs.add(o);
    }

    @Override
    public void supprimerObservateur(IObservateur o) {
        observateurs.remove(o);
    }

    @Override
    public void notifier() {
        for (IObservateur o : observateurs) {
            o.actualiser();
        }
    }
}
