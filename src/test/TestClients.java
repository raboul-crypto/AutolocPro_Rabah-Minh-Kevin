package test;

import clients.Client;

public class TestClients {


    static void afficherClient(String titre, Client c, int anneeCourante) {
        System.out.println("--- " + titre + " ---");
        System.out.println("Nom : " + c.getNom());
        System.out.println("Prénom : " + c.getPrenom());
        System.out.println("Numéro de permis : " + c.getNumeroPermis());
        System.out.println("Téléphone : " + c.getTelephone());
        System.out.println("Année de naissance : " + c.getAnneeNaissance());
        System.out.println("Âge : " + c.calculerAge(anneeCourante) + " ans");
        System.out.println();
    }

    public static void main(String[] args) {
        int anneeCourante = 2026;
        Client c1 = new Client("Dupont", "Marie", "PERM123456", "0612345678", 1995);

        Client c2 = new Client(c1);
        afficherClient("Client complet", c1, anneeCourante);
        afficherClient("Copie du client", c2, anneeCourante);

        c2.setNom("Martin");
        System.out.println("Après modification de la copie :");
        System.out.println("Original : " + c1.getNom());
        System.out.println("Copie    : " + c2.getNom());
    }
}