package Alteklausuren.Klausur_2022.Aufgabe_4;

public class Bodenreinigung extends Eintrag {
    public Bodenreinigung(String name, String firma) {
        super(name, firma);
    }

    @Override
    public int getKosten() {
        return 1570;
    }
}
