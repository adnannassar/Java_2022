package Alteklausuren.Klausur_2021.Aufgabe_3;

public class Aufgabe_3 {
    public static void main(String[] args) {
        int array[][] = {
                {1, 2, 2, 1},
                {11, 0, 1, 4},
                {5, 5, 6, 10}
        };
        System.out.println("Max= " + max(array));
        printArray(berechneHäufigkeiten(array));
    }

    static int max(int[][] feld) {
        int max = feld[0][0];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] > max) {
                    max = feld[i][j];
                }
            }
        }
        return max;
    }

    static int[] berechneHäufigkeiten(int[][] feld) {
        // {0,1,2,3,4,5,6,7,8,9,10,11}
        // {1,1,2,0,0,1,0,0,0,0,1,0}
        int erg[] = new int[countOfArray(feld)];

        for (int i = 0; i < erg.length; i++) {
            erg[i] = berechneHäufigkeiten(feld, i);
        }
        return erg;
    }

    static int berechneHäufigkeiten(int[][] feld, int nummer) {
        int counter = 0;
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] == nummer) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static int countOfArray(int[][] feld) {
        int count = 0;
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                count++;
            }
        }
        return count;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
