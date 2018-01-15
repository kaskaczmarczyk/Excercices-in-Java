package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-09.
 */
class KulaW {

    KulaW(Walec walec) {

    }

    KulaW(Kula kula) {
    }

}

class Walec {
    private double wysokoscWalca;
    private double promienPodstawyWalca;

    public double objetoscWalca(double h, double r) {
        this.wysokoscWalca = h;
        this.promienPodstawyWalca = r;
        return wysokoscWalca * 3.14 * promienPodstawyWalca * promienPodstawyWalca;
    }
}

class Kula {
    double promienKuli;

    public double objetoscKuli(double h) {
        this.promienKuli = h;
        return 4 / 3 * 3.14 * promienKuli * promienKuli * promienKuli;
    }
}

public class Zad05PPCwiczenia12 {
    public static void main(String[] args) {
        Walec walec = new Walec();
        Kula kula = new Kula();

        System.out.println(walec.objetoscWalca(5, 10));
        System.out.println(kula.objetoscKuli(8));
    }
}
