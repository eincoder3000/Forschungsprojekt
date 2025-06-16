import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gericht gericht1 = new Gericht("Pizza Margherita", 7.50, Arrays.asList("Teig", "Tomate", "Käse"));
        Gericht gericht2 = new Gericht("Spaghetti Bolognese", 9.00, Arrays.asList("Pasta", "Fleisch", "Tomate"));

        List<Gericht> gerichte = Arrays.asList(gericht1, gericht2);
        Bestellung bestellung = new Bestellung(gerichte);

        double gesamtpreis = bestellung.gesamtpreisBerechnen();
        System.out.println("Gesamtpreis der Bestellung: " + gesamtpreis + " €");
    }
}

