package Arrays.OneDimArray;

import java.util.Scanner;

public class Test {

    Scanner sc = new Scanner(System.in);
    static char array[][];

    public static void main(String[] args) {
        draw(2, 3);
        // fill();
        // fillMix();
        array = new char[][]{
                {'1', '2', '3'},
                {'1', '2', '3'}
        };
        printArray();

    }


    public static void draw(int n1, int n2) {
        array = new char[n1][n2];
    }

    public static void fill() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j < array.length / 2) {
                    array[i][j] = 'L';
                } else if (j == array.length / 2) {
                    array[i][j] = 'X';
                } else if (j > array.length / 2) {
                    array[i][j] = 'R';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void fillX() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || i + j == array.length - 1 || i == array.length / 2 || j == array.length / 2) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void fillA() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j % 2 != 0 && i % 2 == 0) {
                    array[i][j] = 'A';
                } else if (i % 2 != 0 && j % 2 == 0) {
                    array[i][j] = 'A';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void fillBC() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == array.length / 2 || i + j == Math.pow(array.length / 2, 2)) {
                    array[i][j] = 'B';
                } else if (j - i == array.length / 2 || i - j == array.length / 2) {
                    array[i][j] = 'C';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void fillMix() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (i < array.length / 2 && j > i && j < array.length - i) {
                    array[i][j] = '1';
                } else if (j < array.length / 2 && i > j && i < array.length - j) {
                    array[i][j] = '4';

                } else if (i > array.length / 2 && j < i) {
                    array[i][j] = '3';
                } else if (j > array.length / 2) {
                    array[i][j] = '2';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

    }

    public static void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
