// Java BMI Rechner

public class BMIRechner {
    public static void main(String[] args) {
        // Nutzereingaben lesen
        BufferedRader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Deine Körpergröße in cm?");
        int groesseCM = Integer.parseInt(reader.readLine());
        System.out.println("Dein Gewicht in kg?");
        int gewicht = Integer.parseInt(reader.readLine());

        // BMI = Gewicht / Größe^2
        double groesse = (double groesseCM / 100);
        double bmi = gewicht / (groesse * groesse);

        //Ergebnis formatieren und ausgeben
        NumberFormat formatter = new Decimal Format("##.##");
        System.out.println("Ihr BMI ist " + formatter.format(bmi));

        if (bmi < 18,5) {
            System.out.println("Sie haben Untergewicht!");
            } else if (bmi < 25) {
            System.out.println("Sie haben Normalgewicht!");
            } else if (bmi < 30) {
                System.out.println("Sie haben Übergewicht!");
            } else (bmi < 30) {
                System.out.println("Sie haben schweres Übergewicht");
            }
        }
}