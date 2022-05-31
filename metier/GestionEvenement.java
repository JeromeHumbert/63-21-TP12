package metier;

import domaine.Evenement;


import java.util.ArrayList;

public class GestionEvenement {
    private static ArrayList<Evenement> evenements = new ArrayList<>();
    private static String entete = "";
    private static String enteteAffichage= "";

    public GestionEvenement() {
        chargerDonnees();
        suppressionAnnulation();
        affichage();
        ecrireDonnees();
    }

    private void chargerDonnees(){

    }

    private void suppressionAnnulation(){

    }

    private void affichage(){

    }

    private void ecrireDonnees(){

    }
}
