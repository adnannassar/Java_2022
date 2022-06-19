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
}
