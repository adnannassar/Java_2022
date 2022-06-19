package FußballManschafftVerwaltung;

public class Spieler extends Mitglied {
    private String spielPosition;
    private int anzahlSpieleProSession;


    public Spieler(String name, String vorname, String spielPosition, int anzahlSpieleProSession) {
        super(name, vorname);
        this.spielPosition = spielPosition;
        this.anzahlSpieleProSession = anzahlSpieleProSession;
    }

    @Override
    public double berechneJahresGehalt() {
        return 12 * 180000.00 + (5000.00 * anzahlSpieleProSession);
    }
}
