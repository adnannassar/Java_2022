package OOP;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Jasem", 25, 5000.00, false);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Alex", 28, 3500.00 , true);

        Mitarbeiter[] mitarbeiters = {mitarbeiter1, mitarbeiter2};
        mitarbeiter1.setHatBonus(true);
        for(int i = 0 ; i<mitarbeiters.length; i++){
            System.out.println(mitarbeiters[i].getName() + ", " +
                    mitarbeiters[i].getAge()+ ", " + mitarbeiters[i].getGehalt()+"€");
        }
    }
}


