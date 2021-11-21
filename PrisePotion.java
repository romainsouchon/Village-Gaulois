import java.util.Date;

public class PrisePotion {
    private Habitant habitant;
    private Potion potion;
    private int doseReel;
    private Date datePrise;
    private Date dateFinInterval;

    public PrisePotion(Habitant habitant, Potion potion, int doseReel){
        setHabitant(habitant);
        setPotion(potion);
        setDoseReel(doseReel);
        /* A definir la date actuelle */
    }

    public void CalculDateFin(){
        /*A calculer en fonction des potions et du druide*/
    }
    
    public Habitant getHabitant() {
        return habitant;
    }
    public void setHabitant(Habitant habitant) {
        this.habitant = habitant;
    }

    public Potion getPotion() {
        return potion;
    }
    public void setPotion(Potion potion) {
        this.potion = potion;
    }

    public int getDoseReel() {
        return doseReel;
    }
    public void setDoseReel(int doseReel) {
        this.doseReel = doseReel;
    }

    public Date getDatePrise() {
        return datePrise;
    }
    public void setDatePrise(Date datePrise) {
        this.datePrise = datePrise;
    }

    public Date getDateFinInterval() {
        return dateFinInterval;
    }
    public void setDateFinInterval(Date dateFinInterval) {
        this.dateFinInterval = dateFinInterval;
    }
}
