package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-21.
 */

import java.util.Random;
import java.util.Hashtable;

public class Zad01PPCwiczenia08 {
    public static void main(String[] args) {
        int tablica[][] = new int[8][8];
        int i, j;

        for (i = 0; i < tablica.length; i++) {
            for (j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = (int) (Math.random() * 10);
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean check(int t[][]) {
        int[] first = new int[11];
        int[] second = new int[11];
        {
            for (int i = 0; i < t.length; i++) {
                int k = t[i][i];
                first[k]++;
                k = t[i][t.length - 1 - i];
                second[k]++;
            }
        }
        //druga część zadania mi nie działa !!!!!!!!

/*        for (int i = 0; i < first.length; i++) {
            if (first[i] >= 3 || second[i] >= 3) {
                return true;
            }
        }*/
        return false;
    }
}
