package CwiczeniaZPolskoJaponskiej;
import com.sun.org.apache.regexp.internal.RE;

import java.util.Random;

/**
 * Created by Kasia on 2017-05-26.
 */
public class Zad08ver2PPCwiczenia08 {
    public static void main(String[] args) {

        int i = (int) (Math.random() * 50);
        char tablica[] = new char[i];



        for (int j = 0; j < i; j++) {
            Random r = new Random();
            int Low = 97;
            int High = 122;
            int Result = r.nextInt(High-Low) + Low;
            char znak = (char) (Result);
            tablica[j] = znak;
            System.out.print(tablica[j] + " ");

        }

        System.out.println("");

        if (tablica.length % 2 == 0) {

            //sprawdz czy wyraz pierwszy i ostatni jest taki sam
            for (int j = 0; j < tablica.length / 2; j++) {
                if (tablica[j] == tablica[tablica.length - 1]) {
                    System.out.println("To palindrom");
                    return;
                }
            }
        } else {
            for (int j = 0; j < (tablica.length - 1) / 2; j++) {
                if (tablica[j] == tablica[tablica.length - 1]) {
                    System.out.println("To palindrom");
                    return;
                }
            }
        }
    }
}

