package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-11.
 */

class Kontener {
    Cukier ladunek;
    double masaLadunku;
    int dniPrzydatnosci;

    Kontener(double masaMax) {
        this.masaLadunku = masaMax;
    }

    void zaladuj (Cukier cukier, int dniPrzydatnosci) {
        this.ladunek = cukier;
        this.dniPrzydatnosci = dniPrzydatnosci;
    }

    boolean sprawdzPrzydatnosc () {
        if (this.dniPrzydatnosci >= 0) {
            System.out.println("Cukierek w terminie przydatności.");
            return true;
        }
        System.out.println("Termin przydatności przekroczony.");
        return false;
    }
}

class ZadPPCwiczenia13 {
    public static void main(String[] args) {
        Kontener kontener = new Kontener(50);
        Fabryka fabryka = new Fabryka();
        kontener.zaladuj(fabryka.make(2),-2);
        kontener.sprawdzPrzydatnosc();
    }
}