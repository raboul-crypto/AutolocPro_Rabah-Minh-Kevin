package test;

import clients.Client;

public class TestClients {
    public static void main(String[] args) {
        Client c1 = new Client("Dupont", "Jean", "PERM-12345", "0612345678", 1998);
        System.out.println("Client 1 : " + c1.nom + " " + c1.prenom
                + " ,permis " + c1.numeroPermis + " ,tel " + c1.telephone
                + " ,né en " + c1.anneeNaissance);
        System.out.println("Âge : " + c1.calculerAge(2026) + " ans");

        Client c2 = new Client(c1);
        System.out.println("Client 2 : " + c2.nom + " " + c2.prenom
                + " ,permis " + c2.numeroPermis + " ,tel " + c2.telephone
                + " ,né en " + c2.anneeNaissance);
        System.out.println("Âge : " + c2.calculerAge(2026) + " ans");
        System.out.println("Nombre de clients créés : " + Client.getCompteurClients());
    }
}