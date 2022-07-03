package InterfaceLesson;

public class Test {
    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone(1, "01239123123", 2000);
        SmartPhone galaxy = new SmartPhone(2, "19283712311", 2200);

        iphone.addSMS(100, "Hallo i am adnan");
        iphone.addSMS(100, "Hallo i am Ibrahim");

        galaxy.addSMS(101, "How are you");
        galaxy.addSMS(101, "am fine thanks");

        System.out.println(iphone);
        iphone.ausgabeSMS();
        System.out.println(iphone.getUhrZeit());

        System.out.println();

        System.out.println(galaxy);
        galaxy.ausgabeSMS();
        System.out.println(galaxy.getUhrZeit());

    }
}
