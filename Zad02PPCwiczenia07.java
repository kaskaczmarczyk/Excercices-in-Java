package CwiczeniaZPolskoJaponskiej;

public class Zad02PPCwiczenia07 {
    public static void main(String[] args) {
        String text = "Ala ma kota";
        int licznikA = 0;
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
            if (text.charAt(i) == 'a') {
                System.out.println("Znalazłam");
                licznikA++;
            }
        }
        System.out.println(licznikA);
    }
}
