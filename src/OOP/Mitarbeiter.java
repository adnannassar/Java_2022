package OOP;


// Java beans
public class Mitarbeiter {
    // ATTRIBUTES
    // encapsulation <--> geheimprinzip : private, public, protected, no modifier
    private String name;
    private int age;
    private double gehalt;
    private boolean hatBonus;


    public Mitarbeiter(){}
    public Mitarbeiter(String n){
        name = n;
    }
    public Mitarbeiter(String n, int a){
        name = n;
        age = a;
    }

    // Constructor
    public Mitarbeiter(String name, int age, double gehalt, boolean hatBonus){
        this.name = name;
        this.age = age;
        this.gehalt = gehalt;
        if(hatBonus){
            gehalt += 500;
        }
    }

    // getters = read
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGehalt(){
        return gehalt;
    }

    // setters = write
    public void setGehalt(double gehalt){
        this.gehalt = gehalt;
    }

    public void setHatBonus(boolean hatBonus) {
        if(hatBonus){
            this.hatBonus = true;
            gehalt +=500;
        }

    }
}
