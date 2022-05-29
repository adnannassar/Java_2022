package Algorithmen;

public class ArrayTools {
    public static void main(String[] args) {
        System.out.println(prime(1));
    }

    public static int[][] reverseMatrix(int[][] matrix) {
        int erg[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i <= matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                erg[i][j] = matrix[j][i];
            }
        }
        return erg;
    }

    public static void print1dArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void print1dArray(char array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void print1dArray(long array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void print1dArray(boolean array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void print1dArray(String array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void print2dArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int prime(int zahl) {
        if (zahl == 1) {

        }
        int result = 1;  // wahr
        int i;
        i = 2;
        while (i < zahl) {

            if (zahl % i == 0)   // kein prim zahlen
                result = 0;
            i++;
        }
        return result;
    }
}
