package CwiczeniaZPolskoJaponskiej;

class Wyraz
{
    private String wyraz;
    private int wartosc;

    public Wyraz() {
        this.wyraz = "";
        this.wartosc = 0;
    }

    public void dodajZnak(String wyraz) {
        this.wyraz += wyraz;
        this.wartosc++;
    }

    public String toString() {
        return this.wyraz;
    }

    public int lenght() {
        return this.wartosc;
    }
}

public class Zad04PPCwiczenia11 {
    public static void main(String[] args) {
        Wyraz wyraz = new Wyraz();
        wyraz.dodajZnak("a");
        wyraz.dodajZnak("b");
        wyraz.dodajZnak("c");
        wyraz.dodajZnak("d");
        System.out.println("Wyraz to: " + wyraz.toString());
        System.out.println("Długośc wyrazu to: " + wyraz.lenght());
    }
}

