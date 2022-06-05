package OOP.Vererbung;

public class Person {
    private String name;
    private int age;
    private double gehalt;

    public Person(String name, int age, double gehalt) {
        this.name = name;
        this.age = age;
        this.gehalt = gehalt;
    }

    public String printInfo(){
        return  name + " " + age+ " " + gehalt ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
}
