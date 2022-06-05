package OOP.Aufgaben;

import java.util.Scanner;

public class Tilgung {
    static Scanner scanner = new Scanner(System.in);
    static double darlehens, zinssatz, annuität;
    static  int jahr;

    public static void main(String[] args) {
        inputRead();
        System.out.printf("%-15s%-15s%-15s%s\n", "Jahr", "Zinsen", "Tilgung", "Restschuld");
        for (int i = 1; i <= 3; i++) {
            System.out.printf("%-15d%-15f%-15f%f\n", i, berechneZinsen(), berechneTilgung(), berechneRestschuld(darlehens, zinssatz, annuität));
        }
    }


    static void inputRead() {
        System.out.println("Darlehens betrag: ");
        darlehens = scanner.nextDouble();

        System.out.println("Zinssatz: ");
        zinssatz = scanner.nextDouble();

        System.out.println("Annuität: ");
        annuität = scanner.nextDouble();

        System.out.println("Jahr: ");
        jahr = scanner.nextInt();
    }

    static double berechneZinsen() {
        return (darlehens * zinssatz) / 100;
    }

    static double berechneTilgung() {
        return 200.000;
    }

    static double berechneRestschuld(
            double darlehensbetrag,
            double Zinssatz,
            double annuität) {
        return 10.000;
    }
}
