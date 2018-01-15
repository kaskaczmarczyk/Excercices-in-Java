package CwiczeniaZPolskoJaponskiej;

class Zad04PPCwiczenia06 {
    public static void main(String args[]) {
        double tablica[] = new double[10];
        //double x = Math.ceil(Math.random());
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Math.ceil(Math.random()*50);
           // if (i % 2 == 0)
            System.out.println(tablica[i] + " ");
        }
    }
}
