package Controlleur;

import Vue.IVueFonctionnaire;

public interface IControleurFonctionnaire {
    void setVue(IVueFonctionnaire iVue);
    void ajouterVue(IVueFonctionnaire iVue);
    void gererVue();
    void gererSaisieVueFonctionnaire();
    void gererSaisieVueDiplome();
}
