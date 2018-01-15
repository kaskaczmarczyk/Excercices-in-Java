package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-05.
 */

class ZbiorMetod {
    void ustalWartosc (int x) {
        System.out.println("Zmienna typu int: " + x);
    }

    void ustalWartosc (float x) {
        System.out.println("Zmienna typu float: " + x);
    }
}

class PPJ10_1 {

    public static void main(String[] args) {
        ZbiorMetod ob = new ZbiorMetod();

        ob.ustalWartosc(10);
        ob.ustalWartosc(10.55f);
        ob.ustalWartosc('a');
        ob.ustalWartosc(1);
    }
}