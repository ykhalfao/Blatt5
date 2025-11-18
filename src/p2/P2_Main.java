package p2;

public class P2_Main {
    static void main(String[] args) {
        int [] numbers = {4,5,3,5,6};       //beliebig waehlbar
        int max =0;                         // nimmt wert des hoechsten Zellinhalts an
        int minIndex =0;                    // nimmt Index der Zelle mit dem hoechsten Zellinhalt an
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                minIndex=i;
            }
        }
        System.out.println(max+" "+minIndex);   //zum Pruefen

    }
}
