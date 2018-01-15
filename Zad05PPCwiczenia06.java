package CwiczeniaZPolskoJaponskiej;

import com.sun.org.apache.xpath.internal.SourceTree;

class Zad05PPCwiczenia06 {
    public static void main(String args[]) {
        int tab[] = {1, 0, 0, 0, 2, 0, 0, 0, 3};
        int wiersz1[] = new int[3];
        int wiersz2[] = new int[3];
        int wiersz3[] = new int[3];
        int i = 0,j = 0;

        for (i = 0; i < 3; i++) {
        wiersz1[j] = tab[i];
        for (int x : wiersz1) {
            System.out.print(x + " ");
        }
}
System.out.println();

        wiersz2[j] = tab[i];
        for (int x : wiersz2) {
            System.out.print(x + " ");
        }
        System.out.println();
        wiersz3[j] = tab[i + 3];
        for (int x : wiersz3) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}


