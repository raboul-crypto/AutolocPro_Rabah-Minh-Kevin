package test;

import java.util.Scanner;
import vehicules.Vehicule;

public class TestVehicules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Constructeur par défaut
        Vehicule v1 = new Vehicule();
        v1.afficher();

        // 2. Saisie clavier
        System.out.print("Marque : ");
        String marque = sc.nextLine();;       // lit une ligne entière (pas next())
        System.out.print("Modèle : ");
        String modele =sc.nextLine();

        // 3. Constructeur d'initialisation
        Vehicule v2 = new Vehicule("245 FDS 612", marque, modele,150.50);   // immat + tarif en dur
        v2.afficher();

        // 4. Trajet de 250 km
        System.out.println("Avant trajet :");
        v2.afficher();
        v2.rouler(250);
        System.out.println("Après 250 km :");
        v2.afficher();

        // 5. Constructeur de copie
        Vehicule v3 = new Vehicule(v2);
        v3.afficher();

        // 6. Fin
        sc.close();
    }
}
