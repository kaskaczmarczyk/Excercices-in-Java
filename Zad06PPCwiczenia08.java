package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-24.
 */
public class Zad06PPCwiczenia08 {
    public static void main(String[] args) {
        char[][] tab = {
                {'o', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', 'x', '-'},
                {'-', 'x', 'x', 'x', 'x', 'x', 'x', '-', 'x', '-'},
                {'-', 'x', 'e', '-', '-', '-', '-', '-', 'x', '-'},
                {'-', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };
        int pozycjaX = 0, pozycjaY = 0;
        while (tab[pozycjaY][pozycjaX] != 'e') {

            System.out.println(tab[pozycjaY][pozycjaX]);
            if (pozycjaX + 1 < tab[pozycjaY].length && (tab[pozycjaY][pozycjaX + 1] == '-' || tab[pozycjaY][pozycjaX + 1] == 'e')) { //ruch w prawo
                pozycjaX++;
                if (tab[pozycjaY][pozycjaX] != 'e') {
                    tab[pozycjaY][pozycjaX] = 'k';
                }

            }

            if (pozycjaX - 1 >= 0 && (tab[pozycjaY][pozycjaX - 1] == '-' || tab[pozycjaY][pozycjaX - 1] == 'e')) { //ruch w lewo
                pozycjaX--;
                if (tab[pozycjaY][pozycjaX] != 'e') {
                    tab[pozycjaY][pozycjaX] = 'k';
                }

            }

            if (pozycjaY - 1 >= 0 && (tab[pozycjaY - 1][pozycjaX] == '-' || tab[pozycjaY - 1][pozycjaX] == 'e')) { //ruch w górę
                pozycjaY--;
                if (tab[pozycjaY][pozycjaX] != 'e') {
                    tab[pozycjaY][pozycjaX] = 'k';
                }

            }

            if (pozycjaY + 1 < tab.length && (tab[pozycjaY + 1][pozycjaX] == '-' || tab[pozycjaY + 1][pozycjaX] == 'e')) { //ruch w dół
                pozycjaY++;
                if (tab[pozycjaY][pozycjaX] != 'e') {
                    tab[pozycjaY][pozycjaX] = 'k';
                }
            }
        }
    }
}

