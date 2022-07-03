package FußballManschafftVerwaltung;

import java.util.Scanner;

public class Mannschaft {
    private String name;
    private Mitglied[] mitglieder;
    private Scanner sc;

    public Mannschaft(String name, int capacity) {
        this.name = name;
        this.mitglieder = new Mitglied[capacity];
        sc = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMitglied(Mitglied mitglied) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] == null) {
                mitglieder[i] = mitglied;
                break;
            }
        }
    }

    private void printMitgliederInfos() {
        System.out.printf("%-10s%-10s%-25s%-25s%-25s%-30s\n", "ID", "Type", "Name", "Vorname", "Jahresgehalt", "Sonstiges");
        for (int i = 0; i < (10 + 10 + 25 + 25 + 25 + 40); i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null) {
                System.out.printf("%-10d%-10c%-25s%-25s%-25.2f%-30s\n", mitglieder[i].getId(), getTypeOfMitglied(mitglieder[i]), mitglieder[i].getName(), mitglieder[i].getVorname(), mitglieder[i].berechneJahresGehalt(), mitglieder[i].getSonstiges());
            }
        }
    }

    private char getTypeOfMitglied(Mitglied mitglied) {
        if (mitglied instanceof Spieler) {
            return 'S';
        }
        if (mitglied instanceof Trainer) {
            return 'T';
        }
        if (mitglied instanceof Arzt) {
            return 'A';
        }
        return '?';
    }

    public void showMitgliedCard(int id) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null && mitglieder[i].getId() == id) {
                System.out.println(mitglieder[i]);
                return;
            }
        }
        System.out.println("Der gesuchte Mitglied wurde nicht gefunden!");
    }

    public void showMenu() {
        char option = ' ';
        while (option != 'B') {
            System.out.println("Mannschaft: " + name + "\n");
            printMitgliederInfos();
            System.out.printf("\n%-70s%-55.2f\n", "Summe der Jahresgehälter:", berechneSummeGehälter());
            System.out.print("Weiter Aktionen:\n (A)rzt hinzufügen\n (S)pieler hinzufügen\n (T)rainer hinzufügen\n (B)eenden\nIhre Eingabe: ");
            option = sc.next().charAt(0);
            switch (option) {
                case 'A':
                    addArzt();
                    break;
                case 'S':
                    addSpieler();
                    break;
                case 'T':
                    addTrainer();
                    break;
                case 'B':
                    System.out.println("Danke auf Wiedersehen :)");
                    break;
                default:
                    System.out.println("Bitte etwas gültiges eingeben!");
            }
        }


    }

    private void addTrainer() {
        System.out.println("Adding Trainer:");
        System.out.print("Vorname: ");
        String vorname = sc.next();

        System.out.print("Name: ");
        String name = sc.next();
        int id = 0;
        if (playerExist()) {
            System.out.print("Hat " + name + " einen lieblings Spieler?\n (J)a\n (N)ein\nIhre Eingabe: ");
            char option = sc.next().charAt(0);
            switch (option) {
                case 'J':
                    listAllPlayers();
                    System.out.print("Ihre Eingabe: ");
                    id = sc.nextInt();
                case 'N':
                    break;
            }
        }
        Trainer newTrainer = new Trainer(name, vorname);
        // id
        newTrainer.setLieblingsSpieler((Spieler) getPlayerById(id));
        addMitglied(newTrainer);

    }

    private Mitglied getPlayerById(int id) {
        if (id == 0) {
            return null;
        } else {
            for (int i = 0; i < mitglieder.length; i++) {
                if (mitglieder[i].getId() == id) {
                    return mitglieder[i];
                }
            }
        }
        return null;
    }

    private boolean playerExist() {
        for (int i = 0; i < mitglieder.length; i++) {
            if (getTypeOfMitglied(mitglieder[i]) == 'S') {
                return true;
            }
        }
        return false;
    }

    private void addSpieler() {
        System.out.println("Adding Spieler:");
        System.out.print("Vorname: ");
        String vorname = sc.next();

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Spielposition: ");
        String spielposition = sc.next();

        System.out.print("Anzahl Spiele pro Session: ");
        int anzahlSpieleProSession = sc.nextInt();

        addMitglied(new Spieler(name, vorname, spielposition, anzahlSpieleProSession));
    }

    private void addArzt() {
        System.out.println("Adding Arzt:");
        System.out.print("Vorname: ");
        String vorname = sc.next();

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Fachrichtung: ");
        String fachrichtung = sc.next();

        addMitglied(new Arzt(name, vorname, fachrichtung));
    }

    private double berechneSummeGehälter() {
        double summe = 0.0;
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null)
                summe += mitglieder[i].berechneJahresGehalt();
        }
        return summe;
    }

    private void listAllPlayers() {
        System.out.println("Bitte einen Spieler, durch die Eingabe von ID als lieblingsspieler merken");
        System.out.printf("\t%-10s%-10s%-25s%-25s%-25s%-30s\n", "ID", "Type", "Name", "Vorname", "Jahresgehalt", "Sonstiges");

        for (int i = 0; i < mitglieder.length; i++) {
            if (getTypeOfMitglied(mitglieder[i]) == 'S') {
                System.out.printf("\t%-10d%-10c%-25s%-25s%-25.2f%-30s\n", mitglieder[i].getId(), getTypeOfMitglied(mitglieder[i]), mitglieder[i].getName(), mitglieder[i].getVorname(), mitglieder[i].berechneJahresGehalt(), mitglieder[i].getSonstiges());
            }
        }
    }
}
