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
    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public boolean isBoiteAutomatique() {
        return boiteAutomatique;
    }

    public void setBoiteAutomatique(boolean boiteAutomatique) {
        this.boiteAutomatique = boiteAutomatique;
    }

    @Override
    public String toString() {
        return super.toString() + " " + nombrePlaces + " places ," + typeCarburant+ " ,boîte " +(boiteAutomatique ? "automatique" : "manuelle");
    }
}