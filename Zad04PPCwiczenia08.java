package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-22.
 */
public class Zad04PPCwiczenia08 {
    public static void main(String[] args) {
        int i = (int) (Math.random()*50);
        int[] tablica = new int[i];
        for (int k = 0; k < tablica.length; k++) {
            tablica[k] = (int) (Math.random()*50);
            System.out.print(tablica[k] + " ");
        }

    }
}
