package OOP.Vererbung;

public class Hr extends Person {
    private double hr_bonus;
    public Hr(String name, int age, double gehalt, double hr_bonus) {
        super(name, age, gehalt);
        this.hr_bonus = hr_bonus;
    }

    @Override
    public String printInfo(){
        return  super.printInfo()  + " " + hr_bonus;
    }

}
