package CwiczeniaZPolskoJaponskiej;
import java.lang.String;
/**
 * Created by Kasia on 2017-06-06.
 */

class Osoba {

    void podajImie(String imie){
        System.out.println(imie);
    }
    void podajNazwisko(String nazwisko){
        System.out.println(nazwisko);
    }
    void podajRokUrodzenia(int rokUrodzenia){
        System.out.println(rokUrodzenia);
    }
}

class Zad04PPCwiczenia10 {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.podajImie("Kasia");
        osoba.podajNazwisko("Kaczmarczyk");
        osoba.podajRokUrodzenia(1991);
    }
}
