package CwiczeniaZPolskoJaponskiej;

public class Zad03ver2PPCwiczenia07 {
    public static void main(String[] args) {
        int[] intArray = new int[20];

        for (int i = 0; i < intArray.length - 1; i++) {
            intArray[i] = (int) (Math.random() * 21);
        }

        System.out.println("Wartości naszej tablicy: ");
        System.out.println(java.util.Arrays.toString(intArray));
        System.out.println();

        for (int i = intArray.length - 2; intArray.length / 2 - 3 < i; i--) {
            intArray[i + 1] = intArray[i];
        }

        intArray[intArray.length / 2 - 2] = -1;
        System.out.println("Wartości naszej tablicy po przesunięciu i wstawieniu wartości -1: ");
        System.out.println(java.util.Arrays.toString(intArray));
        System.out.println();
    }
}

