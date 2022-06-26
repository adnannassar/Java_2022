package FußballManschafftVerwaltung;

public abstract class Mitglied {
    private String name, vorname;
    private int id;
    private static int counter = 1;


    public Mitglied(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
        this.id = counter++;
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

    public int getId() {
        return id;
    }

    public abstract double berechneJahresGehalt();

    public abstract String getSonstiges();

    @Override
    public String toString() {
        return "Vorname: " + vorname + "\n" + "Name: " + name;
    }
}
