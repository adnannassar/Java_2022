package Polymorphoie;


public class Main {
    public static void main(String[] args) {
        A einA;
        einA = new A();
        einA = new B();
        // einA = new D();  //Fehler
        einA.methode1();
        // einA.methode2(); //Fehler
        // einA.methode3(); //Fehler
        // einA.methode4(); //Fehler
        // einA.methodeI();

        B einB;
        einB = new B();
        // einB = new C(); //Fehler
        // einB = new D(); //Fehler
        einB.methode1();
        einB.methode2();
        // einB.methode3(); //Fehler
        // einB.methode4(); //Fehler
        // einB.methodeI(); //Fehler

        C einC;
        // einC = new B(); //Fehler
        einC = new C();
        // einC = new D();//Fehler
        einC.methode1();
        // einC.methode2();//Fehler
        einC.methode3();
        // einC.methode4();//Fehler
        einC.methodeI();


        I einI;
        //einI = new B(); //Fehler
        einI = new C();
        einI = new D();
        // einI = new I();  //Fehler
        // einI.methode1(); //Fehler
        // einI.methode2();//Fehler
        // einI.methode3();//Fehler
        // einI.methode4();//Fehler
        einI.methodeI();

        A[] dieAs = {new B(), new C()};
        for (int i = 0; i < dieAs.length; i++) {
            dieAs[i].methode1();
        }

        I[] dieIs = {new C(), new D()};
        for (int i = 0; i < dieIs.length; i++) {
            dieIs[i].methodeI();
        }

        test1(new B());
        test1(new C());
        // test1(new D()); // Fehler
        //test2(new B()); // Fehler
        test2(new C());
        test2(new D());


    }

    public static void test1(A einA) {
        einA.methode1();
    }

    public static void test2(I einI) {
        einI.methodeI();
    }
}


class A {
    public A() {

    }

    public void methode1() {
        System.out.println("Methode 1 from A");
    }
}

class B extends A {
    public B() {

    }

    public void methode1() {
        System.out.println("Methode 1 from B");
    }

    public void methode2() {

    }
}

interface I {
    void methodeI();
}

class C extends A implements I {
    public C() {

    }

    public void methode1() {

    }

    public void methode3() {

    }

    @Override
    public void methodeI() {

    }
}

class D implements I {
    public D() {
    }

    public void methode4() {

    }

    @Override
    public void methodeI() {

    }
}



