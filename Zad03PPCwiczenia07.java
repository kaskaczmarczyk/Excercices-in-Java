package CwiczeniaZPolskoJaponskiej;


public class Zad03PPCwiczenia07 {

    public static void main(String[] args) {
        int[] tablica = new int[20];
        for (int i = 0; i < tablica.length - 1; i++) {
            tablica[i] = (int) (Math.random() * 100);
//            System.out.println(tablica[i]);
        }

//        System.out.println(tablica[10]);
//        for (int i = 11; i < tablica.length; i++) {
//            System.out.println(tablica[i] + " -> " + tablica[i - 1]);
//            tablica[i] = tablica[i-1];
//        }

        for (int i = tablica.length-1; i > 11; i--) {
            System.out.println(tablica[i] + " -> " + tablica[i - 1]);
            tablica[i] = tablica[i-1];
        }

        tablica[10] = -1;

        for (int i : tablica) {
            System.out.println(i);
        }
    }
}
