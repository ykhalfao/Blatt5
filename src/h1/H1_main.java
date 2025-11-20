package h1;

public class H1_main {
    public static void main(String[] args) {
        int[] myArray = {5, 6, 7, 10};
        int[] myArray2 = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            myArray2[i] = myArray[myArray.length - i - 1];
            }

        for (int l = 0; l < myArray.length; l++) {
            System.out.print(myArray2[l] + " ");
    }
    }
}
