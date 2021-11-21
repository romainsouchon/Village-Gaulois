import java.util.ArrayList;
import java.util.Date;

public class ChefduVillage extends Habitant{

    public ChefduVillage(String nnig, String statut, String nom, String specialite, Date dateNaissance, int poids, Adresse adresse) {
        super(nnig, statut, nom, specialite, dateNaissance, poids, adresse);
        //TODO Auto-generated constructor stub
    }
    
    public void CreerCombat(String nom){
        ArrayList<Combat> listeCombat= getAdresse().getVillage().getListeCombats();
        listeCombat.add(new Combat(nom));
    }

    public void ContacterCombattant(){
        ArrayList<Habitant> combattants = new ArrayList<Habitant>();
        ArrayList<Habitant> habitants = getAdresse().getVillage().getListeHabitants();
        for (Habitant h : habitants){
            if (h.getStatut() == "Combattant"){
                combattants.add(h);
            }
        }
    }

    public void ContacterCombattantQuartier(Quartier q){
        ArrayList<Habitant> combattants = new ArrayList<Habitant>();
        ArrayList<Habitant> habitants = getAdresse().getVillage().getListeHabitants();
        for (Habitant h : habitants){
            if (h.getStatut() == "Combattant" && h.getAdresse().getQuartier() == q){
                combattants.add(h);
            }
        }
    }
}
