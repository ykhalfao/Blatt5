package p3;

public class P3_main {
    static void main(String[] args) {
        int MatrixSumme =0;
        int [][] Matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//Beispielwerte aus der Aufgabe
        int [][] Matrix90 = new int[3][3];      //diese Matrix stellt die um 90 Grad gedrehte Matrix da
        Matrix90[0][0] = Matrix[2][0];
        Matrix90[0][1] = Matrix[1][0];
        Matrix90[0][2] = Matrix[0][0];
        Matrix90[1][0] = Matrix[2][1];
        Matrix90[1][1] = Matrix[1][1];
        Matrix90[1][2] = Matrix[0][1];
        Matrix90[2][0] = Matrix[2][2];
        Matrix90[2][1] = Matrix[1][2];
        Matrix90[2][2] = Matrix[0][2];
        for (int k = 0; k < Matrix90.length; k++) {
            for (int l = 0; l < Matrix90.length; l++) {
                System.out.println("Matrix 90 ["+k+"] ["+l+"]: "+Matrix90[k][l]);
            }
        }
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                MatrixSumme += Matrix[i][j];            //bestimmt die Summe der Matrix
                Matrix[i][j] +=1;                       //erhoeht den Wert jedes Elements der Matrix um 1
                System.out.println("Matrix ["+i+"] ["+j+"]: "+Matrix [i][j]);
            }

        }
        System.out.println("Matrix Summe : "+MatrixSumme);
    }
}