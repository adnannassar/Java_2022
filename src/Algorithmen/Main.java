package Algorithmen;

public class Main {
    public static void main(String[] args) {
        int array[] = {2, 7, 3, 1, 10, 8};
        System.out.print("Before: ");
        ArrayTools.print1dArray(array);
        SortingAlgorithmen.bubbleSort(array);
        System.out.print("After:  ");
        ArrayTools.print1dArray(array);

        // Matrix:
        System.out.println("Matrix");
        int [][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("Before: ");
        ArrayTools.print2dArray(matrix);

        int [][] reversedMatrix =  ArrayTools.reverseMatrix(matrix);
        System.out.println("\nAfter: ");
        ArrayTools.print2dArray(reversedMatrix);

    }
}
