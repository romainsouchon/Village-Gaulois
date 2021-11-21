public class Adresse extends Quartier{
    private String voie;
    private int numero;
    private Quartier quartier;

    public Adresse(String nom, String drapeau){
        super(nom, drapeau);
        setVoie(voie);
        setNom(nom);
    }

    public String getVoie() {
        return voie;
    }
    public void setVoie(String voie) {
        this.voie = voie;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Quartier getQuartier() {
        return quartier;
    }
    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }
}
