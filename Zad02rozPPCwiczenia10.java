package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-06.
 */

class ZbiorMetod2 {
    void ustalWartosc1 (int x) {
        System.out.println("Zmienna dostarczona jako parametr: " + x);
        x =+1;
        System.out.println("Zmieniona wartosc: " + x);
    }

    void ustalWartosc1 (float x) {
        System.out.println("Zmienna dostarczona jako parametr: " + x);
        x =+ 50/3;
        System.out.println("Zmieniona wartosc: " + x);
    }

//    void ustalWartosc1 (ob.Liczba) {
//        System.out.println("Zmienna dostarczona jako parametr: " + Liczba);
//        Liczba = Liczba/2;
//        System.out.println("Zmieniona wartosc: " + Liczba);
//    }
}

class Zad03PPCwiczenia10 {

    public static void main(String[] args) {
        ZbiorMetod2 ob = new ZbiorMetod2();

        ob.ustalWartosc1(10);
        ob.ustalWartosc1(10.55f);
        ob.ustalWartosc1('a');
        ob.ustalWartosc1(1);
    }
}

