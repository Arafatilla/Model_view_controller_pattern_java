package modele;

import Vue.IObservateur;

public interface ISujetModele {
    void ajouterObservateur(IObservateur o);
    void supprimerObservateur(IObservateur o);
    void notifier();
}
