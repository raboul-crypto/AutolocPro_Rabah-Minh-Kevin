package clients;

public class Client {
    public String nom;
    public String prenom;
    public String numeroPermis;
    public String telephone;
    public int anneNaissance;

    public Client(){
        nom="N/A";
        prenom="N/A";
        numeroPermis="N/A";
        telephone="N/A";
        anneNaissance=2000;
    }

    public Client(String nom,String prenom, String numeroPermis, String telephone, int anneeNaissance){
        this.nom=nom;
        this.prenom=prenom;
        this.numeroPermis=numeroPermis;
        this.telephone=telephone;
        this.anneNaissance=anneeNaissance;
    }
    public Client(Client c){
        nom=c.nom;
        prenom=c.prenom;
        numeroPermis=c.numeroPermis;
        telephone=c.telephone;
        anneNaissance=c.anneNaissance;
    }

    public int calculerAge(int anneCourante){
        return anneCourante-anneNaissance;
    }
}
