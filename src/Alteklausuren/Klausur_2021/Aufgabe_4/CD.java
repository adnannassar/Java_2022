package Alteklausuren.Klausur_2021.Aufgabe_4;

public class CD implements Medium {

    private int breite;

    public CD(int breite) {
        this.breite = breite;
    }

    @Override
    public double getGewicht() {
        return 1.5;
    }

    @Override
    public double getBreite() {
        return breite;
    }
}
