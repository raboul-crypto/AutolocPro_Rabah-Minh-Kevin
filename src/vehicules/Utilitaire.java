package vehicules;

public class Utilitaire extends Vehicule {
    private double volumeChargement;
    private double capaciteCharge;
    public Utilitaire(String immat, String marque, String modele, double tarif, double volume, double capacite){
        super(immat,marque,modele,tarif);
        this.volumeChargement=volume;
        this.capaciteCharge=capacite;
        System.out.println("Constructeur d'initialisation de Voiture appelé");
    }
}
