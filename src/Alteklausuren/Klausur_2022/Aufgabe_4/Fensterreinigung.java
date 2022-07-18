package Alteklausuren.Klausur_2022.Aufgabe_4;

public class Fensterreinigung extends Eintrag {
    private int kostenProQuadratMeter;
    private Fenster fenster[];

    public Fensterreinigung(String name, String firma, int kostenProQuadratMeter) {
        super(name, firma);
        this.kostenProQuadratMeter = kostenProQuadratMeter;
        this.fenster = new Fenster[100];
    }

    @Override
    public int getKosten() {
        int summe = 0;
        for (Fenster f : fenster) {
            if (f != null) {
                summe += f.getFläche() * kostenProQuadratMeter;
            }
        }
        return summe;
    }
}
