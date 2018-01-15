package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-26.
 */
public class Zad08ver3PPCwiczenia08 {
    public static void main(String[] args) {
        char tablicaNapis[] = {'k', 'a', 'j', 'a', 'k'};
        System.out.println(tablicaNapis);
        System.out.println("Czy palindrom " + czyPalindrom(tablicaNapis));
    }

    static boolean czyParzystaLiczbaZnakow(char tab[]) {
        if (tab.length % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean czyPalindromDlaParzysta(char tab[]) {
        for (int j = 0; j < tab.length / 2; j++) {
            if (tab[j] == tab[tab.length - 1 - j]) {

                //     System.out.println("To palindrom");
            } else {
                //     System.out.println(" Nie palindrom");
                return false;
            }
        }
        return true;
    }

    static boolean czyPalindromDlaNiearzysta(char tab[]) {
        for (int j = 0; j < (tab.length - 1) / 2; j++) {
            if (tab[j] == tab[tab.length - 1 - j]) {
                //     System.out.println("To palindrom");
            } else {
                //    System.out.println(" Nie palindrom");
                return false;
            }
        }
        return true;
    }

    static boolean czyPalindrom(char tab[]) {

        boolean wynikmetody = false;

        if (czyParzystaLiczbaZnakow(tab)) {
            wynikmetody = czyPalindromDlaParzysta(tab);
        }
        else {
            wynikmetody = czyPalindromDlaNiearzysta(tab);
        }
        return wynikmetody;
    }
}
