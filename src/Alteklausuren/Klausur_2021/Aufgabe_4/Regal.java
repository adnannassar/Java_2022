package Alteklausuren.Klausur_2021.Aufgabe_4;

public class Regal {
    private RegalBrett[] regalBretter;

    public Regal() {
        regalBretter = new RegalBrett[10];
        regalBretter[0] = new RegalBrett(10, 20);
        regalBretter[1] = new RegalBrett(10, 20);
    }

    public boolean fügeHinzu(Medium medium) {
        for (int i = 0; i < regalBretter.length; i++) {
            if (regalBretter[i] == null) {
                regalBretter[i].addMedium(medium);
                return true;
            }
        }
        return false;
    }
}
