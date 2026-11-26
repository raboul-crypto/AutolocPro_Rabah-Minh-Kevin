package test;

import clients.Client;

public class TestClients {
    public static void main(String[] args) {
        Client c1 = new Client("Dupont", "Jean", "PERM-12345", "0612345678", 1998);
        System.out.println("Client 1 : " + c1.getNom() + " " + c1.getPrenom()
                + ", permis " + c1.getNumeroPermis() + ", tel " + c1.getTelephone()
                + ", né en " + c1.getAnneeNaissance());
        System.out.println("Âge : " + c1.calculerAge(2026) + " ans");

        Client c2 = new Client(c1);
        System.out.println("Client 2 : " + c2.getNom() + " " + c2.getPrenom()
                + ", permis " + c2.getNumeroPermis() + ", tel " + c2.getTelephone()
                + ", né en " + c2.getAnneeNaissance());
        System.out.println("Âge : " + c2.calculerAge(2026) + " ans");

        System.out.println("-------------------------------------------------------------");
        System.out.println("ETAPE 2");
        Client c3 = new Client("Martin", "Sophie", "PERM-99999", "0698765432", 1990);
        Client c4 = new Client("Martin", "Sophie", "PERM-99999", "0600000000", 1990);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("c3 == c4 : " + (c3 == c4));
        System.out.println("c3.equals(c4) : " + c3.equals(c4));
        System.out.println("c1.equals(c3) : " + c1.equals(c3));
        System.out.println("Nombre de clients créés : " + Client.getCompteurClients());
    }
}