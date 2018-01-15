package CwiczeniaZPolskoJaponskiej;

class Zad02PPCwiczenia06 {
    public static void main(String args[]) {
        int zera = 0, jedynki = 0;
        int tablica[] = { 0, 0, 0, 1, 0, 1, 0, 1, 0, 1 };
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == 0) zera++;
            else jedynki++;
        }
        System.out.println("W tablicy jest " + zera + " zer oraz " + jedynki + " jedynek.");
        }
    }

