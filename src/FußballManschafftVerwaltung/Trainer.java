package FußballManschafftVerwaltung;

public class Trainer extends Mitglied implements PressMeeting{
    private Spieler lieblingsSpieler;

    public Trainer(String name, String vorname) {
        super(name, vorname);
    }

    @Override
    public double berechneJahresGehalt() {
        return 12 * 165000.00;
    }

    @Override
    public String getSonstiges() {

        return lieblingsSpieler != null ? "Lieblingsspieler: " + lieblingsSpieler.getVorname() + " " + lieblingsSpieler.getName() : "Keine Lieblingsspieler";
    }

    public void setLieblingsSpieler(Spieler lieblingsSpieler) {
        this.lieblingsSpieler = lieblingsSpieler;
    }

    public Spieler getLieblingsSpieler() {
        return lieblingsSpieler;
    }

    @Override
    public String toString() {
        return "Type: T\n" + super.toString() + "\nJahresgehalt: " + berechneJahresGehalt() + "\nSonstiges: " + getSonstiges();
    }

    @Override
    public void pressMeeting() {

    }
}
