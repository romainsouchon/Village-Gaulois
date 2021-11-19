

public class Casque {
    private String type;
    private String grade;
    private String etat;
    private boolean stocke;
    private Habitant collecteur;

    public Casque(String type, String Grade, String Etat, Habitant collecteur){
        setType(type);
        setGrade(grade);
        setEtat(etat);
        setStocke(stocke);
        setCollecteur(collecteur);
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEtat() {
        return etat;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }

    public boolean getStocke(){
        return this.stocke;
    }
    public void setStocke(boolean stocke){
        this.stocke = stocke;
    }

    public Habitant getCollecteur() {
        return collecteur;
    }
    public void setCollecteur(Habitant collecteur) {
        this.collecteur = collecteur;
    }
}
