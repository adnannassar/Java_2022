package Alteklausuren.Klausur_2022.Aufgabe_3;

public class Aufgabe_3 {
    public static void main(String[] args) {

    }

    public static int[][] erzeugeFeldEinfach(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j + 2] = 1;
            }
        }
        return array;
    }
}
