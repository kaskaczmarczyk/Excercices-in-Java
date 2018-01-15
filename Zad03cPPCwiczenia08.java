package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-22.
 */
public class Zad03cPPCwiczenia08 {
    public static void main(String[] args) {
        char[][] tab = {
                {'S', 'a', 'm', 's', 'u', 'n', 'g'},
                {'N', 'o', 'k', 'i', 'a'},
                {'A', 'p', 'p', 'l', 'e'},
                {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
                {'A', 'l', 'c', 'a', 't', 'e', 'l'},
                {'S', 'o', 'n', 'y'},
                {'J', 'o', 'l', 'l', 'a'}
        };

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                int licznik = 0;
                if (tab[i][j] == 'i') {
                    licznik++;
                    System.out.print(tab[i]);
                    System.out.println(" - ten wyraz ma " + licznik + " liter i.");
                }
            }
        }
    }
}
