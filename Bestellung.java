import java.util.List;

public class Bestellung {
    private List<Gericht> gerichte;

    public Bestellung(List<Gericht> gerichte) {
        this.gerichte = gerichte;
    }

    public double gesamtpreisBerechnen() {
        double summe = 0.0;
        for (Gericht g : gerichte) {
            summe += g.getPreis();
        }
        return summe;
    }
}
