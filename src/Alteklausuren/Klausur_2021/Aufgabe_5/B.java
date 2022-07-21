package Alteklausuren.Klausur_2021.Aufgabe_5;

public class B  extends A{
    protected int m = 10;
    protected String matrNr = "123";

    public B(int m) {
        super(m + 2);
        //this.m = m + 1;
        x++;
    }

    public B(A a, int m) {
        super(a.m + m);
        this.m = a.m;
        x++;
    }

    public int getM() {
        return m;
    }

    public boolean gleich(A a) {
        boolean erg = getM() == a.getM();
        // Zeitpunkt 1
        return erg;
    }
}
