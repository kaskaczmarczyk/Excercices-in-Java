package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-06.
 */

class Liczba {
void przypiszWartosc(int x) {
    System.out.println("Wartosc przypisana wynosi: " + x);
}
void wyswietlWartosc(int x) {
    System.out.println("Wartosc wyswietlana wynosi: " + x);
}
}

class Zad02rozPPCwiczenia10 {
    public static void main(String[] args) {
        Liczba ob = new Liczba();

        ob.przypiszWartosc(3);
        ob.wyswietlWartosc(6);
    }
}
