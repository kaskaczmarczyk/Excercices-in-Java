package CwiczeniaZPolskoJaponskiej;

public class ZliczaWszystkieParzysteZPrzedzialu0Do100 {

	public static void main(String[] args) {
		int a, licznik = 0;
		for (a = 0; a <= 100;a++) {
			if (a % 2 == 0) {
				licznik++;
			}
		}
		System.out.print(licznik);
	}
}
