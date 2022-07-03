package Grundlagen;

import java.util.Scanner;

import static java.lang.Math.PI;



public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


            boolean x = true;

            do {
                System.out.println("Wählen Sie eine der Folgende Optionen aus: " +
                        "\n1)_ Berechnung von Primzahlen. " +
                        "\n2)_ Berechnung von Fakultiät. " +
                        "\n3)_ Eemitlung von Volumen and Fläche von Kreis, Rechteck und Dose. " +
                        "\n4)_ Exit. ");
                int i = sc.nextInt();
                if (i < 1 || i >=5){
                    System.out.println("Bitte wählen Sie eine gültige Zahl aus: ");
                    i = sc.nextInt();
                }

                switch (i){
                    case 1:
                        getPrimeNumbers();
                        break;
                    case 2:
                        getFactorial();
                        break;
                    case 3:
                        getMathematischeBerechnungenEinerForm();
                        break;
                    case 4:
                        x = false;
                        break;
                }
            } while (x == true);

        }


        public static void getPrimeNumbers(){
            System.out.println("Calculation of prime numbers");
            System.out.println("Please Enter a number: ");

            int n = sc.nextInt();
            int i = 0;
            int j = 0;
            String primeNumber = "";

            for (i = 1; i <= n; i++){
                int counter = 0;
                for (j = i; j >= 1; j--){
                    if (i % j == 0){
                        counter += 1;
                    }
                }
                if (counter == 2){
                    primeNumber = primeNumber + i + " ";
                }
            }

            System.out.println("Prime numbers from 1 to " + n + " are: ");
            System.out.println(primeNumber);
        }

        public static void getFactorial(){
            System.out.println("Calculation of factorial");
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            int i = 0;
            int j = 0;
            int fac = 1;

            if (n == 0) fac = 1;

            for (i = 1; i <= n; i++){
                fac *= i;
            }
            System.out.println("Factorial of " + n + " = " + fac);
        }

        public static void getMathematischeBerechnungenEinerForm(){

            boolean x = true;

            do {
                System.out.println(" 1)- Umfang, Deckelfläche, Mantelfläche, Oberfläche und Volumen von Dose. " +
                        "\n 2)- Durchmesser, Umfang, Fläche von Kreis. " +
                        "\n 3)- Fläche und Umfang von Rechteck." +
                        "\n 4)- Exit ");
                System.out.println("Um welche geometrische Form es geht, Wählen Sie eine aus: ");
                int i = sc.nextInt();
                if (i < 1 || i >= 5) {
                    System.out.println("Bitte geben Sie eine gültige Zahl ein: ");
                    i = sc.nextInt();
                }
                switch (i) {
                    case 1:
                        System.out.println("Geben Sie den Radius ein: ");
                        int rDose = sc.nextInt();
                        System.out.println("Geben Sie die Höhe ein: ");
                        int h = sc.nextInt();
                        System.out.println("Umfang der Dose = " + 2 * PI * rDose);
                        System.out.println("Deckelfläche der Dose = " + PI * rDose * rDose);
                        System.out.println("Mantelfläche der Dose = " + (2 * PI * rDose) * h);
                        System.out.println("Oberfläche der Dose = " + (PI * rDose * rDose) * h);
                        break;
                    case 2:
                        System.out.println("Geben Sie den Radius ein: ");
                        int rKreis = sc.nextInt();
                        System.out.println("Durchmesser des Kreis: " + 2 * rKreis);
                        System.out.println("Umfang des Kreis: " + 2 * PI * rKreis);
                        System.out.println("Fläche des Kreis: " + PI * rKreis * rKreis);
                        break;
                    case 3:
                        System.out.println("Geben Sie die Länge ein: ");
                        int a = sc.nextInt();
                        System.out.println("Geben Sie die Breite ein: ");
                        int b = sc.nextInt();
                        System.out.println("Fläche des Rechtecks: " + a * b);
                        System.out.println("Umfang des Rechtecks: " + ((2 * a) + (2 * b)));
                        break;
                    case 4:
                        x = false;
                        break;

                }

            } while (x == true);




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