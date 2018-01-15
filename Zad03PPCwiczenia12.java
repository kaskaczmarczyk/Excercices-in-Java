package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-09.
 */

class C {
    static String zmienna;
    int pole1, pole2;

    public C (String zmienna, int pole1, int pole2) {
        this.zmienna = zmienna;
        this.pole1 = pole1;
        this.pole2 = pole2;
    }

    public void display() {
        System.out.println(zmienna + " " + pole1 + " " + pole2);
    }
}

public class Zad03PPCwiczenia12 {
    public static void main(String[] args) {
        C ob1 = new C("kl", 8, 0);
        C ob2 = new C("ab", 4, 77);
        C ob3 = new C("re", 3, 012);
        ob1.display();
        ob2.display();
        ob3.display();

    }
}
