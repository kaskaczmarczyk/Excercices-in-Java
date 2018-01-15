package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-06.
 */

class Kwadrat {
    double bok;

    Kwadrat (double a) {
        bok = a;
    }

    void show () {
        System.out.println("Objetosc szescianu wynosi " + bok*bok*bok);
    }
}

public class Zad01PPCwiczenia11 {
    public static void main(String[] args) {
        Kwadrat ob = new Kwadrat(6);
        ob.show();
    }
}
