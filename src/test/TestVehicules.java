package test;

import java.util.Scanner;
import vehicules.Vehicule;

public class TestVehicules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicule v1 = new Vehicule();
        v1.afficher();

        System.out.print("Marque : ");
        String marque = sc.nextLine();
        System.out.print("Modèle : ");
        String modele =sc.nextLine();

        Vehicule v2 = new Vehicule("245 FDS 612", marque, modele,150.50);
        v2.afficher();

        System.out.println("Avant trajet :");
        v2.afficher();
        v2.rouler(250);
        System.out.println("Après 250 km :");
        v2.afficher();

        Vehicule v3 = new Vehicule(v2);
        v3.afficher();

        System.out.println("-------------------------------------------------------------");
        System.out.println("ETAPE 2");
        Vehicule a = new Vehicule("EF-456-GH", "Renault", "Clio", 35.0);
        Vehicule b = new Vehicule("EF-456-GH", "Peugeot", "208", 40.0);
        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b) : " + a.equals(b));

        System.out.println("Test des validations :");
        a.setTarifJournalier(-10.0);
        a.setKilometrage(-500);
        System.out.println(a);

        Vehicule[] tableau = {
                new Vehicule("AA-111-BB", "Peugeot", "308", 45.0),
                new Vehicule("AA-222-BB", "Toyota", "Yaris", 30.0),
                new Vehicule("AA-333-BB", "Renault", "Megane", 50.0)
        };
        System.out.println("Tableau de véhicules :");
        for (Vehicule v : tableau) {
            System.out.println(v);
        }

        System.out.println("Nombre de véhicules créés : " + Vehicule.getCompteurVehicules());
        System.out.println("Devise : " + Vehicule.DEVISE);
        sc.close();

    }

}
