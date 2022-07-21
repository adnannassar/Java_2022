package Alteklausuren.Klausur_2021.Aufgabe_4;

public class RegalBrett {
    private int breite;
    private double tragkraft;
    private Medium[] meiden;


    public RegalBrett(int breite, double tragkraft) {
        this.breite = breite;
        this.tragkraft = tragkraft;
        this.meiden = new Medium[100];
    }

    public int getBreite() {
        return breite;
    }

    public double getTragkraft() {
        return tragkraft;
    }

    public void addMedium(Medium m) {
        for (int i = 0; i < meiden.length; i++) {
            if (meiden[i] == null
                    && m.getGewicht() <= tragkraft
                    && m.getBreite() <= breite) {
                meiden[i] = m;
                this.tragkraft -= m.getGewicht();
                this.breite -= m.getBreite();
                break;
            }
        }
    }
}
