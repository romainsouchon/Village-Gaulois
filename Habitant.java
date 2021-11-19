import java.util.Date;

public class Habitant{
    private String nnig;
    private String statut;
    private String nom;
    private String specialite;
    private Date dateNaissance;
    private int poids;
    private Adresse adresse;

    public Habitant(String nnig, String statut, String nom, String specialite, Date dateNaissance, int poids, Adresse adresse){
        setNnig(nnig);
        setStatut(statut);
        setNnig(nnig);
        setSpecialite(specialite);
        setDateNaissance(dateNaissance);
        setPoids(poids);
        setAdresse(adresse);
    }

    public String getNnig() {
        return nnig;
    }
    public void setNnig(String nnig) {
        this.nnig = nnig;
    }

    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getPoids() {
        return poids;
    }
    public void setPoids(int poids) {
        this.poids = poids;
    }

    public Adresse getAdresse() {
        return adresse;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}