package CwiczeniaZPolskoJaponskiej;
import java.util.Arrays;
import java.util.Collections;

public class Zad05uproszczonePPCwiczenia08 {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = (int) (Math.random() * 50);
            for (int j = tablica.length - 1; j >= i; j--) {

                if (tablica[i] > tablica[i + 1]) {
                    int t = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = t;
                }
            }
            for (int k = 0; k < tablica.length; k++) {
                System.out.print(tablica[i] + " ");
            }
            System.out.println();
        }
    }
}

