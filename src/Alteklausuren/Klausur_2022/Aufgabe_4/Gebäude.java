package Alteklausuren.Klausur_2022.Aufgabe_4;

public class Gebäude {
    private Putzplan putzplan;
    private Fenster fenster[];

    public Gebäude(Putzplan putzplan) {
        this.putzplan = putzplan;
        this.fenster = new Fenster[100];
    }

    public boolean allFensterGeputzt() {
        for (int i = 0; i < fenster.length; i++) {
            if (fenster[i] != null && !fenster[i].equals(putzplan.getEintag(i))) {
                return false;
            }
        }
        return true;
    }
}
