package CwiczeniaZPolskoJaponskiej;

public class Zad09Cwiczenia06 {

    public static void main(String[] args) {
        int tab[][] = new int[5][5];
        int i, j;

        for (i = 0; i < tab.length; i++)
            for (j = 0; j < tab.length; j++) {
                tab[i][j] = (int) (Math.random() * 10);
                System.out.print(tab[i][j] + " ");
                if (j == tab.length - 1) System.out.println();
            }

        boolean rozne = true;
        for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab.length && j != i; j++) {
                if (tab[j][j] == tab[i][i]) rozne = false;
            }
        }
        System.out.println(rozne ? "rozne" : "powtorki");
    }
}