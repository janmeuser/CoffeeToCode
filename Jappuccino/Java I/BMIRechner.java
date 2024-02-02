import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BMIRechner {
    public static void main(String[] args) {
        try {
            // Nutzereingaben lesen
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Bitte geben Sie Ihre Körpergröße in cm ein:");
            int groesseCM = Integer.parseInt(reader.readLine());

            System.out.println("Bitte geben Sie Ihr Gewicht in kg ein:");
            int gewicht = Integer.parseInt(reader.readLine());

            // Überprüfen, ob die eingegebenen Werte positiv sind
            if (groesseCM <= 0 || gewicht <= 0) {
                System.out.println("Bitte geben Sie positive Werte für Körpergröße und Gewicht ein.");
                return;
            }

            // BMI = Gewicht / (Größe^2)
            double groesse = (double) groesseCM / 100;
            double bmi = gewicht / (groesse * groesse);

            // Ergebnis formatieren und ausgeben
            NumberFormat formatter = new DecimalFormat("##.##");
            System.out.println("Ihr BMI ist " + formatter.format(bmi));

            // BMI-Kategorie ausgeben
            if (bmi < 18.5) {
                System.out.println("Sie haben Untergewicht!");
            } else if (bmi < 25) {
                System.out.println("Sie haben Normalgewicht!");
            } else if (bmi < 30) {
                System.out.println("Sie haben Übergewicht!");
            } else {
                System.out.println("Sie haben schweres Übergewicht.");
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Fehler bei der Eingabe. Bitte geben Sie gültige Zahlen ein.");
        }
    }
}
