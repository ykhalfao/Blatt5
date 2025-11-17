package h1;

public class H1_Main {
    public static void main(String[] args) {
        int a=4;
        int b=4;
        if (b==a) {

            int [] myArray = {5,6,7,10}; //eigentlich: int [] myArray;
                                                    // myArray = new int [a]; (wenn das Array laenger waere muesste man das Programm entsprechend verlaengern)
            int[] myArray2;
            myArray2 = new int [b];
            myArray2 [0] = myArray [a-(a-3)];   //ist wie myArray [0] = myArray [3]
            myArray2 [a-(a-1)] = myArray [a-(a-2)];   //untere Zeilen Analog
            myArray2 [a-(a-2)] = myArray [a-(a-1)];
            myArray2 [a-(a-3)] = myArray [0];
            myArray = myArray2;
            System.out.println(myArray [a-1]);
        }


    }
}
