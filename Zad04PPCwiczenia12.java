package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-09.
 */

public class Zad04PPCwiczenia12 {
    public static void main(String[] args) {
       // System.out.println("argumenty " + args[0]);
        String lancuch = "Ala ma kota";
        System.out.println(lancuch.charAt(2));
        System.out.println(lancuch.indexOf('k'));
        System.out.println();
        String tablica[] = lancuch .split(" ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }


}
