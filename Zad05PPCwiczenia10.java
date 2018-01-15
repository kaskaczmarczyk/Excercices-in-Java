package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-06.
 */

class LiczbaZespolona {
    private double rzeczywista;
    private double urojona;

    LiczbaZespolona(double rzeczywista, double urojona) {
        this.rzeczywista = rzeczywista;
        this.urojona = urojona;
    }

    void dodaj(double rzeczywista, double urojona) {
        this.rzeczywista = this.rzeczywista + rzeczywista;
        this.urojona = this.urojona + urojona;
    }

    void odejmij(double rzeczywista, double urojona) {
        this.rzeczywista = this.rzeczywista - rzeczywista;
        this.urojona = this.urojona - urojona;
    }

    public void wyswietl() {
        System.out.println(rzeczywista + " " + urojona + "i");
    }

    public void pomnoz(double rzeczywista, double urojona) {
        this.rzeczywista = this.rzeczywista * rzeczywista;
        this.urojona = this.urojona * urojona;
    }
}

public class Zad05PPCwiczenia10 {
    public static void main(String[] args) {

        LiczbaZespolona liczbaZespolona = new LiczbaZespolona(5, 8);
        liczbaZespolona.dodaj(3,3);
        liczbaZespolona.odejmij(8,0);
        liczbaZespolona.pomnoz(2, 3);
        liczbaZespolona.wyswietl();
    }
}
