package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-26.
 */

public class Zad08PPCwiczenia08 {
    public static void main(String[] args) {
        String wort = "reliefpfpfeiller";
        char[] warray = wort.toCharArray();
        System.out.println(czyPalindrom(warray));
    }

    public static boolean czyPalindrom(char[] wort) {
        boolean palindrom = false;
        if (wort.length % 2 == 0) {
            for (int i = 0; i < wort.length / 2 - 1; i++) {
                if (wort[i] != wort[wort.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        } else {
            for (int i = 0; i < (wort.length - 1) / 2 - 1; i++) {
                if (wort[i] != wort[wort.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}
