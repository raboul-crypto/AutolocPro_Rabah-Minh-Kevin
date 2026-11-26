package vehicules;

public class Voiture extends Vehicule {
    private int nombrePlaces;
    private String typeCarburant;
    private boolean boiteAutomatique;
    public Voiture() {
        super();
        this.nombrePlaces = 5;
        this.typeCarburant = "N/A";
        this.boiteAutomatique = false;
        System.out.println("Constructeur par défaut de Voiture appelé");
    }
    public Voiture(String immat, String marque, String modele, double tarif,int places, String carburant, boolean auto) {
        super(immat,marque,modele,tarif);
        this.nombrePlaces=places;
        this.typeCarburant=carburant;
        this.boiteAutomatique=auto;
        System.out.println("Constructeur d'initialisation de Voiture appelé");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nombrePlaces + " places ," + typeCarburant+ " ,boîte " +(boiteAutomatique ? "automatique" : "manuelle");
    }
}

