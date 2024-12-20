package modele;

public interface IModeleFonctionnaire extends ISujetModele {
    public String getIdentifiant();
    public void setIdentifiant(String identifiant);
    public String getNom();
    public void setNom(String nom);
    public String getPrenom();
    public void setPrenom(String prenom);
    public String getAffecation();
    public void setAffecation(String affectation);
    public String getGradeDiplome();
    public String getSpecialiteDiplome();
    public void miseAJour(String identifiant, String nom, String prenom, String affectation);
    public void miseAJourDiplome(String grade, String specialite);
}
