package FußballManschafftVerwaltung;

public class Spieler extends Mitglied implements PressMeeting {
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

    @Override
    public String getSonstiges() {
        return "Position: " + spielPosition + " / Spieleinsätze: " + anzahlSpieleProSession;
    }

    @Override
    public String toString() {
        return "Type: S\n" + super.toString() + "\nJahresgehalt: " + berechneJahresGehalt() + "\nSonstiges: " + getSonstiges();
    }

    @Override
    public void pressMeeting() {
        System.out.println("Ich bin ein Spieler");
    }
}
