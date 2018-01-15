package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-10.
 */

class Cukierek {
    String smak;
    double waga;

    Cukierek (String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public void show() {
        System.out.println("Cukierek ma smak " + smak + " i wagę " + waga + " gram.");
    }
}
public class Zad01PPCwiczenia13 {
    public static void main(String[] args) {
        Cukierek cukierek = new Cukierek("pomarańczowy", 10.2);
        cukierek.show();
    }
}
