package FußballManschafftVerwaltung;

public class Arzt extends Mitglied {
    private String fachrichtung;

    public Arzt(String name, String vorname, String fachrichtung) {
        super(name, vorname);
        this.fachrichtung = fachrichtung;
    }


    public String getFachrichtung() {
        return fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }


    @Override
    public double berechneJahresGehalt() {
        return 12 * 10000.00;
    }

    @Override
    public String getSonstiges() {
        return "Fachrichtung: " + fachrichtung;
    }

    @Override
    public String toString() {
        return "Type: A\n" + super.toString() + "\nJahresgehalt: " + berechneJahresGehalt() + "\nSonstiges: " + getSonstiges();
    }
}
