package Aufgabe_1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        printPrime(7);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i +"\t");
            }
        }
        System.out.println();
    }

}

