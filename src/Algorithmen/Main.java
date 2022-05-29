package Algorithmen;

public class Main {
    public static void main(String[] args) {
        int [] array = {2, 7, 3, 1, 10, 8};
        System.out.print("Before: ");
        ArrayTools.print1dArray(array);
        SortingAlgorithmen.bubbleSort(array);
        System.out.print("After:  ");
        ArrayTools.print1dArray(array);

        String [] langauges   = {"English", "Deutsch", "Arabisch"};
        ArrayTools.print1dArray(langauges);
        System.out.println("is ARaBiSch existed: " + SearchingAlgorithmen.linearSearch(langauges, "ARaBiSch"));
        System.out.println("is Arabisch existed: " + SearchingAlgorithmen.linearSearch(langauges, "Arabisch"));

        String [][] items = {
                {"English", "Deutsch", "Arabisch"},
                {"Apple", "Orange"},
                {"Java", "C++", "C#", "Android"}
        };

        System.out.println("is English existed: " + SearchingAlgorithmen.linearSearch(items, "English"));
        System.out.println("is Apple existed: " + SearchingAlgorithmen.linearSearch(items, "Apple"));

        // Matrix:
        System.out.println("\nMatrix");
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
