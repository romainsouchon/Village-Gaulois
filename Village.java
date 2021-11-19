import java.util.ArrayList;

public class Village {
    private ArrayList<Habitant> listeHabitants;
    private ArrayList<Quartier> listeQuartiers;
    private ArrayList<Combat> listeCombats;

    public Village(ArrayList<Habitant> listeHabitants, ArrayList<Quartier> listeQuartiers, ArrayList<Combat> listeCombats){
        setListeHabitants(listeHabitants);
        setListeQuartiers(listeQuartiers);
        setListeCombats(listeCombats);
    }

    public ArrayList<Habitant> getListeHabitants() {
        return listeHabitants;
    }
    public void setListeHabitants(ArrayList<Habitant> listeHabitants) {
        this.listeHabitants = listeHabitants;
    }

    public ArrayList<Quartier> getListeQuartiers() {
        return listeQuartiers;
    }
    public void setListeQuartiers(ArrayList<Quartier> listeQuartiers) {
        this.listeQuartiers = listeQuartiers;
    }

    public ArrayList<Combat> getListeCombats() {
        return listeCombats;
    }
    public void setListeCombats(ArrayList<Combat> listeCombats) {
        this.listeCombats = listeCombats;
    }
}
