package vehicules;

public class Voiture extends Vehicule {
    private int nombrePlaces;
    private String typeCarburant;
    private boolean boiteAutomatique;
    public Voiture() {
        super();
        nombrePlaces = 5;
        typeCarburant = "N/A";
        boiteAutomatique = false;
        System.out.println("Constructeur par défaut de Voiture appelé");
    }
    public Voiture(String immat, String marque, String modele, double tarif,int places, String carburant, boolean auto {
        super(immat,marque,modele,tarif);
        this.nombrePlaces=places;
        this.typeCarburant=carburant;
        this.boiteAutomatique=auto;
        System.out.println("Constructeur d'initialisation de Voiture appelé");
    }
}
