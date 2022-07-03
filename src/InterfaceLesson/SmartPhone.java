package InterfaceLesson;

import java.time.LocalTime;


public class SmartPhone extends Telefon implements Uhr {
    private double displayGroße;
    SMS[] messages;

    public SmartPhone(int id, String rufnummer, double displayGroße) {
        super(id, rufnummer);
        this.displayGroße = displayGroße;
        this.messages = new SMS[1000];
    }

    public double getDisplayGroße() {
        return displayGroße;
    }

    public int getAnzahlSMS() {
        int anzahl = 0;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public int addSMS(int empfängerId, String text) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = new SMS(empfängerId, text);
                return i;
            }
        }
        return -1;
    }

    public void ausgabeSMS() {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                System.out.println(messages[i]);
            }
        }
    }

    @Override
    public LocalTime getUhrZeit() {
        return LocalTime.now();
    }

    @Override
    public String toString() {
        return super.toString() + " " + displayGroße + "px";
    }
}
