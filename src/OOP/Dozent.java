package OOP;

public class Dozent {
    String name, lehrgebiet;
    boolean dekan;
    char geschlecht;

    public Dozent(String name, String lehrgebiet, boolean dekan, char geschlecht) {
        this.name = name;
        this.lehrgebiet = lehrgebiet;
        this.dekan = dekan;
        this.geschlecht = geschlecht;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLehrgebiet(String lehrgebiet) {
        this.lehrgebiet = lehrgebiet;
    }

    public void setDekan(boolean dekan) {
        this.dekan = dekan;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getName() {
        return name;
    }

    public String getLehrgebiet() {
        return lehrgebiet;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    boolean isDekan(){
        return dekan;
    }

    @Override
    public String toString() {
        return "Dozent{" +
                "name='" + name + '\'' +
                ", lehrgebiet='" + lehrgebiet + '\'' +
                ", dekan=" + dekan +
                ", geschlecht=" + geschlecht +
                '}';
    }
}

