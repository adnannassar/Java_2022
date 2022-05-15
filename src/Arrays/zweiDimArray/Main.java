package Arrays.zweiDimArray;

import javax.management.ObjectName;

public class Main {
    public static void main(String[] args) {
        print2dArray(arrayOfNumber());
        Object array[][] = {
                {'*', 'a', '*'},
                {'*', '*', '*'},
                {'b', '*', '0'}
        };
        System.out.println();
        print2dArray(array);
        System.out.println();
        berechneSterneProZeile(array);

        System.out.println();

    }

    static boolean checkNum(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    // array =  {1,2,1,3,5,1}, value = 1 --->  3
    static int count(int[] nums, int value) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                count++;
            }
        }
        return count;
    }

    static Object[][] arrayOfNumber() {
        Object[][] array = new Object[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 2 + i + j;
            }
        }
        return array;
    }

    static void print2dArray(Object array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void berechneSterneProZeile(Object[][] array) {
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals('*')) {
                    counter++;
                }
            }
            System.out.println(i + ": " + counter);
        }
    }


}
