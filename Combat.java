import java.util.ArrayList;
import java.util.Date;

public class Combat {
    
    private String nom;
    private String lieu;
    private Date dateDebut;
    private Date dateFin;
    private String planBataille;
    private ArrayList<Habitant> listeCombattant ;
    private ArrayList<Casque> listeCasqueRapporte;

    public Combat(String nom){
        setNom(nom);
    }

    public void AjouterCombattant(Habitant h){
        getListeCombattant().add(h);
    }
    public void AjouterCasque(Casque c){
        getListeCasqueRapporte().add(c);
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLieu() {
        return lieu;
    }
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getPlanBataille() {
        return planBataille;
    }
    public void setPlanBataille(String planBataille) {
        this.planBataille = planBataille;
    }

    public ArrayList<Habitant> getListeCombattant() {
        return listeCombattant;
    }
    public void setListeCombattant(ArrayList<Habitant> listeCombattant) {
        this.listeCombattant = listeCombattant;
    }

    public ArrayList<Casque> getListeCasqueRapporte() {
        return listeCasqueRapporte;
    }
    public void setListeCasqueRapporte(ArrayList<Casque> listeCasqueRapporte) {
        this.listeCasqueRapporte = listeCasqueRapporte;
    }


}
