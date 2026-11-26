package vehicules;

public class Moto extends Vehicule {
    private int cylindree;

    public Moto(){
        super();
        this.cylindree=0;
    }
    public Moto(String immat, String marque, String modele, double tarif, int cylindree) {
        super(immat, marque, modele, tarif);
        this.cylindree = cylindree;
        System.out.println("Constructeur d'initialisation de Moto appelé");
    }

    public boolean necessitePermisA2OuA() {
        return cylindree > 125;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + cylindree + " cm3";
    }
}
