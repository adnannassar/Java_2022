package Arrays.OneDimArray;

import java.util.Scanner;

public class ArrayTools {
    int array[];
    char array2[][];
    Scanner sc = new Scanner(System.in);

    public void init(int size) {
        array = new int[size];
    }

    public void fill() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value for index " + i);
            array[i] = sc.nextInt();
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public int findMin() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public void printReverse() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public void drawX(int length, int width) {
        array2 = new char[length][width];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = '*';
            }
        }
    }

    public void print2D() {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j] +" ");
            }
            System.out.println();
        }
    }
}

