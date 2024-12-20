package Vue;

import java.util.Scanner;

public class VueFonctionnaire implements IVueFonctionnaire {
    private final Scanner input = new Scanner(System.in);

    @Override
    public void activerVue() {
        System.out.println("Vue activée !");
    }

    @Override
    public String saisirIdentifiant() {
        System.out.print("Identifiant: ");
        return input.next();
    }

    @Override
    public String saisirNom() {
        System.out.print("Nom: ");
        return input.next();
    }

    @Override
    public String saisirPrenom() {
        System.out.print("Prénom: ");
        return input.next();
    }

    @Override
    public String saisirAffectation() {
        System.out.print("Affectation: ");
        return input.next();
    }

    @Override
    public String saisirGrade() {
        System.out.print("Grade: ");
        return input.next();
    }

    @Override
    public String saisirSpecialite() {
        System.out.print("Spécialité: ");
        return input.next();
    }
    
 

    @Override
    public void actualiser() {
    	// sumulation de l'acualisatsion 
    	
        System.out.println("Les données ont été actualisées.");
    }
}
