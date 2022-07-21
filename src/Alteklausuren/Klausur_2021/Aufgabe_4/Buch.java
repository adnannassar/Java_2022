package Alteklausuren.Klausur_2021.Aufgabe_4;

public class Buch implements Medium {
    private int breite;
    private double gewicht;

    public Buch(int breite, double gewicht) {
        this.breite = breite;
        this.gewicht = gewicht;
    }

    @Override
    public double getGewicht() {
        return gewicht;
    }

    @Override
    public double getBreite() {
        return breite;
    }
}
