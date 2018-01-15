package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-21.
 */
public class Zad06PPCwiczenia07 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        a = (int) (Math.random() * 50);
        b = (int) (Math.random() * 60);
        c = (int) (Math.random() * 20);

        System.out.println("Liczba elementów tablicy a wynosi: " + a);
        System.out.println("Liczba elementów tablicy b wynosi: " + b);
        System.out.println("Liczba elementów tablicy c wynosi: " + c);

        int tablicaA[] = new int[a];
        int tablicaB[] = new int[b];
        int tablicaC[] = new int[c];

        for (int i = 0; i < tablicaA.length; i++) //wypełnienie tablicyA dowolnymi wartościami
        {
            tablicaA[a] = (int) (Math.random() * 40);
        }

        for (int x : tablicaA                     //wyświetlenie tablicyA
                ) {
            System.out.println(x);
        }

        for (int i = 0; i < tablicaB.length; i++) {
            tablicaB[a] = (int) (Math.random() * 40);
        }

        for (int x : tablicaB
                ) {
            System.out.println(x);
        }

        for (int i = 0; i < tablicaC.length; i++) {
            tablicaC[a] = (int) (Math.random() * 40);
        }

        for (int x : tablicaC
                ) {
            System.out.println(x);
        }
    }

}

