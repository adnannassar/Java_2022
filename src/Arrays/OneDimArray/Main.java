package Arrays.OneDimArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayTools arrayTools = new ArrayTools();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Array Tools\n please enter the size of Array: ");
        int size = scanner.nextInt();

        arrayTools.init(size);
        arrayTools.fill();
        arrayTools.print();
        arrayTools.printReverse();

        int min = arrayTools.findMin();
        System.out.println("The min from array is " + min);


        arrayTools.drawX(5, 5);
        arrayTools.print2D();



        Object employees[][] = {{"Ahamd", 10.500}, {"Salaam", 15.500}};

        System.out.println(isExist(employees, "Salam"));

    }

    public static boolean isExist(Object[][] array, String name) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][0] == "Salam"){
                    return true;
                }
            }
        }
        return false;
    }
}
