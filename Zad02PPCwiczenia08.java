package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-22.
 */
public class Zad02PPCwiczenia08 {
    public static void main(String[] args) {
        double[] tablica1 = new double[3];
        double[] tablica2 = new double[3];
        double[] tablica3 = new double[3];

        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = (Math.random() * 5);

        }
        for (double i : tablica1) {
            System.out.format("%.1f%n", i);
        }

        System.out.println();

        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = (Math.random() * 5);

        }
        for (double i : tablica2) {
            System.out.format("%.1f%n", i);
        }

        System.out.println();

        for (int i = 0; i < tablica1.length; i++) {
            double t = tablica1[i];
            double k = tablica2[tablica2.length - 1 - i];
            tablica3[i] = (double) (t + k);
            }

        for (double i : tablica3) {
            System.out.format("%.1f%n", i);
        }
    }
}
