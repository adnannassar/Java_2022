package FußballManschafftVerwaltung;

public class Trainer extends Mitglied {
    private Spieler lieblingsSpieler;

    public Trainer(String name, String vorname){
        super(name, vorname);
    }
    @Override
    public double berechneJahresGehalt() {
        return 12 * 165000.00;
    }

    public void setLieblingsSpieler(Spieler lieblingsSpieler) {
        this.lieblingsSpieler = lieblingsSpieler;
    }

    public Spieler getLieblingsSpieler() {
        return lieblingsSpieler;
    }
}
