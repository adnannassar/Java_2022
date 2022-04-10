package FirstLesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter nr1: ");
        int nr1 = scanner.nextInt();

        System.out.println("Enter nr2: ");
        int nr2 = scanner.nextInt();

        System.out.println("Result  = " + (nr1 + nr2));
    }
}
