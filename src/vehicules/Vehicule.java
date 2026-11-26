package vehicules;

public class Vehicule {
    public String immatriculation;
    public String marque;
    public String modele;
    public int kilometrage;
    public double tarifJournalier;
    public boolean disponible;

    public Vehicule(){
        immatriculation = "N/A";
        marque = "N/A";
        modele = "N/A";
        kilometrage = 0;
        tarifJournalier= 0.0;
        disponible=true;
        System.out.println("Constructeur par défaut appelé");
    }
    public Vehicule(String immatriculation, String marque,String modele, double tarifJournalier){
        this.immatriculation=immatriculation;
        this.marque=marque;
        this.modele=modele;
        this.tarifJournalier=tarifJournalier;
        this.kilometrage = 0;
        this.disponible = true;
        System.out.println("Constructeur d'initialisation appelé");
    }
    public Vehicule(Vehicule v) {
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
    public void rouler(int km){
        kilometrage+=km;
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