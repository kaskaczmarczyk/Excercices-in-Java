package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-09.
 */

class A {
    final static int wartosc = 5;
    static char znak;

    public void show() {
        System.out.println("znak: " + znak);
        System.out.println("wartość: " + wartosc);
        System.out.println();
    }

    public void zmienWartosc() {
    //    wartosc = 10;
        znak = 'M';
    }

}

    public class Zad01PPCwiczenia12 {
        public static void main(String[] args) {
            A bezZmian = new A();
            A zeZmiana = new A();

            System.out.println("Bez zmian");
            bezZmian.show();
            System.out.println("Ze zmianami");
            zeZmiana.show();

            System.out.println("Pola po zmianach: ");
            bezZmian.zmienWartosc();

            System.out.println("Bez zmian");
            bezZmian.show();
            System.out.println("Ze zmianami");
            zeZmiana.show();
        }
    }

