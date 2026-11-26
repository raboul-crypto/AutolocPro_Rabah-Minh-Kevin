package clients;

public class Client {

    private static int compteurClients = 0;
    private String nom;
    private String prenom;
    private String numeroPermis;
    private String telephone;
    private int anneeNaissance;

    public static int getCompteurClients() {
        return compteurClients;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public String getTelephone() {
        return telephone;
    }


    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Client(){
        nom="N/A";
        prenom="N/A";
        numeroPermis="N/A";
        telephone="N/A";
        anneeNaissance=2000;
        compteurClients++;
        System.out.println("Constructeur par défaut appelé");

    }

    public Client(String nom,String prenom, String numeroPermis, String telephone, int anneeNaissance){
        this.nom=nom;
        this.prenom=prenom;
        this.numeroPermis=numeroPermis;
        this.telephone=telephone;
        this.anneeNaissance=anneeNaissance;
        compteurClients++;
        System.out.println("Constructeur d'initialisation appelé");

    }
    public Client(Client c) {
        compteurClients++;
        System.out.println("Constructeur de copie appelé");
        if (c == null) {
            System.out.println("Erreur : client à copier null, valeurs par défaut utilisées");
            nom = "N/A";
            prenom = "N/A";
            numeroPermis = "N/A";
            telephone = "N/A";
            anneeNaissance = 2000;
        } else {
            nom = c.nom;
            prenom = c.prenom;
            numeroPermis = c.numeroPermis;
            telephone = c.telephone;
            anneeNaissance = c.anneeNaissance;
        }
    }

    public int calculerAge(int anneCourante){
        return anneCourante-anneeNaissance;
    }
}