package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-22.
 */
public class Zad03PPCwiczenia08 {
    public static void main(String[] args) {
        char [][] tab = {
                {'S', 'a', 'm', 's', 'u', 'n', 'g'},
                {'N', 'o', 'k', 'i', 'a'},
                {'A', 'p', 'p', 'l', 'e'},
                {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
                {'A', 'l', 'c', 'a', 't', 'e', 'l'},
                {'S', 'o', 'n', 'y'},
                {'J', 'o', 'l', 'l', 'a'}
        };
        char zmienna = 'C';
        System.out.println(Character.toString(zmienna).toLowerCase());

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                for (int k = j+1; k < tab[i].length; k++){
                    if ((Character.toString(tab[i][j]).toLowerCase()).equals(Character.toString(tab[i][k]).toLowerCase())) {
                        System.out.println(tab[i]);
                        System.out.println(tab[i][j] + " = " + tab[i][k]);
                        System.out.println("Znalezione 2 takie same litery.");
                    }
                }
            }
        }


//        System.out.println((byte) tab[0][0]);
/*        int t = 10;
//        System.out.println((double) t);
        for (int i = 0; i < tab.length; i++) {
            int sum = 0;
            for (int j = 0; j < tab[i].length; j++) {
                sum = sum + (byte) tab[i][j];
                System.out.println(tab[i][j] + " -> " + (byte) tab[i][j] + " Suma: " +sum);
                if (sum > 255) {
                    System.out.println(tab[i]);
                    break;
                }
//                System.out.println((byte) tab[i][j]);
            }
        }*/
    }
}
