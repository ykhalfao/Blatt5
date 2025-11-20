package h2;

public class H2_main {
    static void main(String[] args) {
        int n = 12345;      //n beliebig waehlbar (muss <=9 Ziffern haben und positiv sein)
        int digits = 0;

        int[] a = new int[9];       //9 Zellen voller Nullen

        if (n == 0) {
            digits = 1;              //wenn n = 0 funktioniert die untere Schleife nicht deswegen digits direkt = 1
        } else {
            int nDigits = n;
            while (nDigits > 0) {
                nDigits = nDigits / 10;
                digits++;           //digits wird = Anzahl: ziffern & n bleibt gleich
            }
        }
        int aHinten = 8;     //Array von hinten fuellen
        int nA = n;          //n veraendert sich hierdurch nicht
        while (nA > 0) {      //Array mit n fuellen
            a[aHinten] = nA % 10;
            nA = nA / 10;
            aHinten--;
        } // ______Test Ausgabe______//
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("n Zifferanzahl: " + digits);
    }
}
