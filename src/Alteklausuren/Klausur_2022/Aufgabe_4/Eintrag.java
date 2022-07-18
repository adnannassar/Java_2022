package Alteklausuren.Klausur_2022.Aufgabe_4;

public abstract class Eintrag {
    private String name, firma;

    public Eintrag(String name, String firma) {
        this.name = name;
        this.firma = firma;
    }
    public abstract int getKosten();
}
