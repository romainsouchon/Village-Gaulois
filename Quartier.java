

public class Quartier {
    private String nom;
    private String drapeau;
    private Village village;

    public Quartier(String nom, String drapeau){
        setNom(nom);
        setDrapeau(drapeau);
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDrapeau() {
        return drapeau;
    }
    public void setDrapeau(String drapeau) {
        this.drapeau = drapeau;
    }

    public Village getVillage() {
        return village;
    }
    public void setVillage(Village village) {
        this.village = village;
    }
}
