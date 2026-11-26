package clients;

public class Client {
    public String nom;
    public String prenom;
    public String numeroPermis;
    public String telephone;
    public int anneeNaissance;

    public Client(){
        nom="N/A";
        prenom="N/A";
        numeroPermis="N/A";
        telephone="N/A";
        anneeNaissance=2000;
        System.out.println("Constructeur par défaut appelé");

    }

    public Client(String nom,String prenom, String numeroPermis, String telephone, int anneeNaissance){
        this.nom=nom;
        this.prenom=prenom;
        this.numeroPermis=numeroPermis;
        this.telephone=telephone;
        this.anneeNaissance=anneeNaissance;
        System.out.println("Constructeur d'initialisation appelé");

    }
    public Client(Client c) {
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