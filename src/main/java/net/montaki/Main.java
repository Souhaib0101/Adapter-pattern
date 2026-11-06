package net.montaki;


import net.montaki.adapter.HdmiVgaAdaptateur;
import net.montaki.computer.*;

public class Main {
    public static void main(String[] args) {
        UniteCentre ordinateur = new UniteCentre();

        // Connexion à un écran VGA
        ordinateur.setVga(new Ecran());
        ordinateur.print("Bonjour sur l'écran");

        // Connexion à un vidéoprojecteur VGA
        ordinateur.setVga(new VideoProjecteur());
        ordinateur.print("Présentation sur le vidéoprojecteur");

        // Connexion au SuperVP via VGA
        ordinateur.setVga(new SuperVP());
        ordinateur.print("Affichage sur le SuperVP");

        // Connexion à une TV HDMI grâce à l'adaptateur
        HdmiVgaAdaptateur adaptateur = new HdmiVgaAdaptateur();
        adaptateur.setHdmi(new Tv());

        ordinateur.setVga(adaptateur);
        ordinateur.print("Bonjour sur la TV via l'adaptateur");
    }
}