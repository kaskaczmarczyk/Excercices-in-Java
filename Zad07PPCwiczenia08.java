package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-25.
 */

class Zad07PPCwiczenia08 {
    public static void main(String[] args) {
        char ch = '7';
        Zad07PPCwiczenia08 zad07PPCwiczenia08 = new Zad07PPCwiczenia08();
        zad07PPCwiczenia08.myMethod((int) ch);
        zad07PPCwiczenia08.myMethod((double) ch);

    }

    void myMethod(int i) {
        i++;
        System.out.println(i);
    }

    void myMethod(double i) {
        i--;
        System.out.println(i);
    }
}

