package Alteklausuren.Klausur_2021.Aufgabe_5;

public class A {
    protected static int x = 1;
    public int m;

    public A(int m) {
        this.m = m;
        x++;
    }

    public int get() {
        return getM();
    }

    public int getM() {
        return m;
    }

    public boolean gleich(A a) {
        return a.m == this.m;
    }
}
