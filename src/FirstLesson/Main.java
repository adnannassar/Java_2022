package FirstLesson;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfLoops = getNumberOfLoops();

        for (int i = 1; i <= numberOfLoops; i++) {
            System.out.println("Loop: "  +i );
            readTheNumbersFromUser();
            System.out.println("...........................");
        }
    }

    public static int getNumberOfLoops() {
        System.out.println("Enter the number of loops");
        return sc.nextInt();
    }

    public static void readTheNumbersFromUser() {
        System.out.println("Enter nr 1");
        int nr1 = sc.nextInt();
        System.out.println("Enter nr 2");
        int nr2 = sc.nextInt();
        add(nr1, nr2);
    }

    public static void add(int nr1, int nr2) {
        int result = nr1 + nr2;
        System.out.println("The result of " + nr1 + " + " + nr2 + " = " + result);
    }
}