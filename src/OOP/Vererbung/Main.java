package OOP.Vererbung;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("max", 25, 12000.000);
        Hr hr1 = new Hr("Müller", 30, 16000.000, 5000.000);
        Mitarbeiter mitarbeiter = new Mitarbeiter("Adnan", 31, 10000.000,10);

        System.out.println(p.printInfo());
        System.out.println(hr1.printInfo());
        System.out.println(mitarbeiter.printInfo());
    }
}
