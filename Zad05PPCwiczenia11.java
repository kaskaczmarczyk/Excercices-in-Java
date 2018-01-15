package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-06-09.
 */

class Wyraz2 {
    private String string;
    private Wyraz2 nastepnyWyraz;

    public Wyraz2(String string) {
        this.string = string;
    }

    public void setNastepnyWyraz(Wyraz2 nastepnyWyraz) {
        this.nastepnyWyraz = nastepnyWyraz;
    }

    public void show() {
        System.out.print(this.string + " ");
        if (this.nastepnyWyraz != null) {
            this.nastepnyWyraz.show();
        }
    }
}

public class Zad05PPCwiczenia11 {
    public static void main(String[] args) {
        Wyraz2 ob1 = new Wyraz2("Piewszy");
        Wyraz2 ob2 = new Wyraz2("Drugi");
        Wyraz2 ob3 = new Wyraz2("Trzeci");

        ob1.setNastepnyWyraz(ob2);
        ob2.setNastepnyWyraz(ob3);

        ob1.show();
        System.out.println();
    }
}


