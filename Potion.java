public class Potion {
    
    private String nom;
    private String effet;
    private int dosetheo;
    private String intervaltheo;

    public Potion(String nom, String effet, int dosetheo, String intervaltheo){
        setNom(nom);
        setEffet(effet);
        setDosetheo(dosetheo);
        setIntervaltheo(intervaltheo);
    }


    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEffet() {
        return effet;
    }
    public void setEffet(String effet) {
        this.effet = effet;
    }

    public int getDosetheo() {
        return dosetheo;
    }
    public void setDosetheo(int dosetheo) {
        this.dosetheo = dosetheo;
    }
    
    public String getIntervaltheo() {
        return intervaltheo;
    }
    public void setIntervaltheo(String intervaltheo) {
        this.intervaltheo = intervaltheo;
    }
}
