import java.util.ArrayList;
import java.util.Date;

public class Druide extends Habitant {

    private ArrayList<PrisePotion> regiPrisePotions;

    public Druide(String nnig, String statut, String nom, String specialite, Date dateNaissance, int poids,
            Adresse adresse) {
        super(nnig, statut, nom, specialite, dateNaissance, poids, adresse);
        //TODO Auto-generated constructor stub
    }

    public void FairePrisePotion(Habitant h, Potion p, int doseReel){
        getRegiPrisePotions().add(new PrisePotion(h, p, doseReel));
    }

    public ArrayList<PrisePotion> getRegiPrisePotions() {
        return regiPrisePotions;
    }
    public void setRegiPrisePotions(ArrayList<PrisePotion> regiPrisePotions) {
        this.regiPrisePotions = regiPrisePotions;
    }
    
    
}
