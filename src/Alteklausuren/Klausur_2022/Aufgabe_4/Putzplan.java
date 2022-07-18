package Alteklausuren.Klausur_2022.Aufgabe_4;

public class Putzplan {
    private Eintrag einträge[];

    public Putzplan() {
        this.einträge = new Eintrag[100];
    }

    public Eintrag getEintag(int i) {
        return i >= 0 && i < einträge.length ? einträge[i] : null;
    }
}
