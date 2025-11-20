package h3;

public class H3_main {
    static void main(String[] args) {
        int[][] einheiten = {{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1}, new int[15]};

        int input = 123456789; //beliebig aber positiv

        for (int i = 0; i < einheiten[0].length; i++) {

            int wert = einheiten[0][i];
            int anzahl = input / wert;      // wie viele Einheit passen in Input rein
            einheiten[1][i] = anzahl;       // In Zelle Speichern
            input = input % wert;           // Restbetrag

            System.out.println("Zelle " + (i + 1) + ": " + anzahl);
        }
    }
}
