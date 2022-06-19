package FußballManschafftVerwaltung;

public abstract class Mitglied {
    private String name, vorname;

    public Mitglied(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return this.name;
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public abstract double berechneJahresGehalt();
}
