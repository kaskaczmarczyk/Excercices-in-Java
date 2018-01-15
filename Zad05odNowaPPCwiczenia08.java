package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-24.
 */
public class Zad05odNowaPPCwiczenia08 {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        System.out.println("Oryginalna tablica:");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = (int) (Math.random() * 50);
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        System.out.println("Posortowana tablica:");
        for (int i = 0; i < tablica.length; i++) {
            for (int b = tablica.length - 1; b > i; b--) {
                if (tablica[b - 1] > tablica[b]) {
                    int t = tablica[b - 1];
                    tablica[b - 1] = tablica[b];
                    tablica[b] = t;
                }
            }
                System.out.print(tablica[i] + " ");
            }
        }
    }


