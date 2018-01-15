package CwiczeniaZPolskoJaponskiej;

/**
 * Created by Kasia on 2017-05-20.
 */
public class Zad04ver2PPCwiczenia07 {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        int counter = 0;

        for (int i=0; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random()*2);
        }

        System.out.println("Wartości naszej tablicy: ");
        System.out.println(java.util.Arrays.toString(intArray));
        System.out.println();

        for (int i=0; i < intArray.length-2; i++) {
            if (intArray[i] == 1 && intArray[i+1] == 0 && intArray[i+2] == 1) {
                counter++;
            }
        }

        System.out.println("Liczba sekwencji 1 0 1 wynosi: "+counter);
    }
}
