package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-26.
 */
public class Zad09PPCwiczenia08 {
    public static void main(String[] args) {
        int n = 0; //n to wyraz ciagu Fibonacciego
        System.out.println(obliczaCiagFibonacciego(20));
    }

    static int obliczaCiagFibonacciego(int n) {
        int wynik = 0;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n > 1) {
            wynik = obliczaCiagFibonacciego(n - 1) + obliczaCiagFibonacciego(n - 2);
            return wynik;
        }
        return -1;
    }
}




