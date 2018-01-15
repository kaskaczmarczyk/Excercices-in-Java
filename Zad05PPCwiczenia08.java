package CwiczeniaZPolskoJaponskiej;

import java.util.*;

/**
 * Created by Kasia on 2017-05-23.
 */
public class Zad05PPCwiczenia08 {

    public static void main(String[] args) {
        int tablica[][] = new int[10][10];

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = (int) (Math.random() * 50);


                for (int a = 0; a < (tablica[i].length); a++) {
                    for (int b = tablica[i].length; b >= a; b--) {
                        if (tablica[i][j] > tablica[i][j + 1]) {
                            int t = tablica[i][j];
                            tablica[i][j] = tablica[i][j + 1];
                            tablica[i][j + 1] = t;
                        }
                    }
                }
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

    }
}

