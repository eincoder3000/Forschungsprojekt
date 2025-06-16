import java.util.List;

public class Gericht {
    private String name;
    private double preis;
    private List<String> zutaten;

    public Gericht(String name, double preis, List<String> zutaten) {
        this.name = name;
        this.preis = preis;
        this.zutaten = zutaten;
    }

    public double getPreis() {
        return preis;
    }

    public String getName() {
        return name;
    }
}
