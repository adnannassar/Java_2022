package OOP.Bruch;

import OOP.Dozent;

public class DozentTest {
    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("Sonya", "Informatik", false, 'F');
        Dozent derDekan = new Dozent("Preis", "Informatik", true, 'M');

        System.out.println(dieDozentin);
        System.out.println(derDekan);

        dieDozentin.setLehrgebiet("Mathe");
        System.out.println(dieDozentin);


    }
}
