package Algorithmen;

public class SortingAlgorithmen {

    // Bubble sort
    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                // ArrayTools.print1dArray(array);
                if (array[i] < array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
