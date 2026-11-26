package vehicules;

public class Vehicule {
    public static final String DEVISE = "EUR";
    private static int compteurVehicules = 0;
    private String immatriculation;
    private String marque;
    private String modele;
    private int kilometrage;
    private double tarifJournalier;
    private boolean disponible;

    public static int getCompteurVehicules() {
        return compteurVehicules;
    }
    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public double getTarifJournalier() {
        return tarifJournalier;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTarifJournalier(double tarifJournalier) {
        if (tarifJournalier < 0) {
            System.out.println("Erreur : tarif négatif refusé (" + tarifJournalier + ")");
        } else {
            this.tarifJournalier = tarifJournalier;
        }
    }

    public void setKilometrage(int kilometrage) {
        if (kilometrage < 0) {
            System.out.println("Erreur : kilométrage négatif refusé (" + kilometrage + ")");
        } else {
            this.kilometrage = kilometrage;
        }
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Vehicule(){
        immatriculation = "N/A";
        marque = "N/A";
        modele = "N/A";
        kilometrage = 0;
        tarifJournalier= 0.0;
        disponible=true;
        compteurVehicules++;
        System.out.println("Constructeur par défaut appelé");
    }
    public Vehicule(String immatriculation, String marque,String modele, double tarifJournalier){
        this.immatriculation=immatriculation;
        this.marque=marque;
        this.modele=modele;
        setTarifJournalier(tarifJournalier);
        this.kilometrage = 0;
        this.disponible = true;
        compteurVehicules++;
        System.out.println("Constructeur d'initialisation appelé");
    }
    public Vehicule(Vehicule v) {
        compteurVehicules++;
        System.out.println("Constructeur de copie appelé");
        if (v == null) {
            System.out.println("Erreur : véhicule à copier null, valeurs par défaut utilisées");
            immatriculation = "N/A";
            marque = "N/A";
            modele = "N/A";
            kilometrage = 0;
            tarifJournalier = 0.0;
            disponible = true;
        } else {
            immatriculation = v.immatriculation;
            marque = v.marque;
            modele = v.modele;
            kilometrage = v.kilometrage;
            tarifJournalier = v.tarifJournalier;
            disponible = v.disponible;
        }
    }
    public void rouler(int km) {
        if (km < 0) {
            System.out.println("Erreur : distance négative refusée (" + km + ")");
        } else {
            kilometrage += km;
        }
    }
    public void afficher(){
        System.out.println("Vehicule{immatriculation='" + immatriculation
                + "', marque='" + marque
                + "', modele='" + modele
                + "', km=" + kilometrage
                + ", tarif=" + tarifJournalier
                + ", disponible=" + disponible + "}");
    }
}