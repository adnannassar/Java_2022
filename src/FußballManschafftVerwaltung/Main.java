package FußballManschafftVerwaltung;

public class Main {
    public static void main(String[] args) {
        Spieler mario = new Spieler("Götze", "Mario","Mittelfeld", 5);
        Spieler pierre = new Spieler("Aubameyang", "Pierre-Emerik","Sturm", 18);

        Trainer thomas = new Trainer("Tuchel", "Thomas");
        thomas.setLieblingsSpieler(pierre);

        Arzt marcus = new Arzt("Braun", "Marcus", "Orthopädie");

        /*
        Mannschaft bvb = new Mannschaft("BVB");

        bvb.addMitglied(mario);
        bvb.addMitglied(pierre);
        bvb.addMitglied(thomas);
        bvb.addMitglied(marcus);

        bvb.printMitgliederInfos();
         */

    }
}
