package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-20.
 */
public class Zad04PPCwiczenia07 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        int licznik = 0;

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = (int) (Math.random()*2) ;
            System.out.println(tablica[i]);
        }
        for (int i = 0; i < tablica.length; i++) {
            for ( ; tablica[i] == 1; ) {
                if (tablica[i + 1] == 0) {
                    if (tablica[i +2] == 1) {
                        licznik ++;
                        return;
                    }
                }
            }
        }
        System.out.println("Jest " + licznik + " razy sekwencja 1-0-1.");
    }
}

