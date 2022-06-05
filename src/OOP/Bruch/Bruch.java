package OOP.Bruch;

public class Bruch {
    private int zaehler, nenner;

    public Bruch(int zaehler) {
        this.zaehler = zaehler;
        this.nenner = 1;
    }

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZeahler() {
        return this.zaehler;
    }

    public int getNenner() {
        return this.nenner;
    }

    void multipliziere(int n) {
        this.zaehler *= n;
    }

    void multipliziere(Bruch b) {
        this.zaehler *= b.zaehler;
        this.nenner *= b.nenner;
    }

    void dividiere(Bruch b) {
        this.zaehler *= b.nenner;
        this.nenner *= b.zaehler;
    }

    @Override
    public String toString() {
        kuerze();
        if (nenner == 0) {
            return "undefined";
        } else if (zaehler == 0) {
            return "0";
        }
        else if(nenner == 1){
            return String.valueOf(zaehler);
        }
        else {
            return zaehler + "/" + nenner;
        }
    }

    void kuerze() {
        int ggt =  ggt(zaehler, nenner);
        this.zaehler /= ggt;
        this.nenner /= ggt;
    }

    int ggt(int a, int b) {
        if (a == 0) {
            return b;
        }
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
