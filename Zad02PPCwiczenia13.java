package CwiczeniaZPolskoJaponskiej;
import java.util.ArrayList;

/**
 * Created by Kasia on 2017-06-10.
 */

class Cukier {
    int rodzaj;
    public Cukier (int rodzaj) {
        this.rodzaj = rodzaj;
    }
/*    public void nadajRodzaj (int rodzaj) {
        this.rodzaj = rodzaj;
    }*/
}

class Fabryka {
    ArrayList<Cukier> rejestr = new ArrayList<Cukier>();
    public Cukier make(int rodzaj) {
        for (int i = 0; i < rejestr.size(); i++) {
            if (rejestr.get(i).rodzaj == rodzaj) {
                System.out.println("Cukierej jest w rejestrze.");
                return rejestr.get(i);
            }
        }
        Cukier nowyCukier = new Cukier(rodzaj);
        rejestr.add(nowyCukier);
 //       nowyCukier.nadajRodzaj(rodzaj);
       // nowyCukier.rodzaj = rodzaj;
        System.out.println("Cukierka nie było.");
        return nowyCukier;
    }
}

public class Zad02PPCwiczenia13 {
    public static void main(String[] args) {
        Fabryka fabryka = new Fabryka();
        fabryka.make(2);
        fabryka.make(8);
        fabryka.make(2);
        fabryka.make(2);
        fabryka.make(8);
    }
}
