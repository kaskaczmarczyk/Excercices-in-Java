package CwiczeniaZPolskoJaponskiej;
import java.util.ArrayList;
/**
 * Created by Kasia on 2017-06-11.
 */

class Magazyn {
    ArrayList<Kontener> lista = new ArrayList<Kontener>(5);

    void przyjmijKontener(Kontener kontener) {
        lista.add(kontener);
        System.out.println("Przyjeto kontener o indeksie " + lista.indexOf(kontener));
    }

    Kontener wydajKontener(int indeks) {
        if (indeks > lista.size()){
            System.out.println("Nie ma takiego kontenera.");
            Kontener pustyKontener = new Kontener(5);
            return pustyKontener;
        }
        else {
            lista.get(indeks);
            System.out.println("Wydano kontener numer " + indeks);
            return lista.get(indeks);
        }
    }
}

public class Zad04PPCwiczenia13 {
    public static void main(String[] args) {
    Magazyn magazyn = new Magazyn();
    Kontener kontener = new Kontener(5);
    Kontener kontenerMarka = new Kontener(50);
    magazyn.przyjmijKontener(kontener);
    magazyn.wydajKontener(5);
    magazyn.przyjmijKontener(kontenerMarka);
    magazyn.przyjmijKontener(kontener);
    }
}
