package clients;

public class client {
    public String nom;
    public String prenom;
    public String numeroPermis;
    public String telephone;
    public int anneNaissance;

    public client(){
        nom="N/A";
        prenom="N/A";
        numeroPermis="N/A";
        telephone="N/A";
        anneNaissance=2000;
    }

    public client(String nom,String prenom, String numeroPermis, String telephone, int anneeNaissance){
        this.nom=nom;
        this.prenom=prenom;
        this.numeroPermis=numeroPermis;
        this.telephone=telephone;
        this.anneNaissance=anneeNaissance;
    }
    public client(client c){
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
