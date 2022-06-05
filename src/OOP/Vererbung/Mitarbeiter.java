package OOP.Vererbung;

public class Mitarbeiter extends Person {
    int anzahl_überstunden;

    public Mitarbeiter( String name, int age, double gehalt  ,int anzahl_überstunden) {
        super(name, age, gehalt);
        this.anzahl_überstunden = anzahl_überstunden;
    }

    @Override
    public String printInfo(){
        return  super.printInfo()  + " " + anzahl_überstunden;
    }
}
