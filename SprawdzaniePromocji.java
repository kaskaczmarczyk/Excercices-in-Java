package CwiczeniaZPolskoJaponskiej;

public class SprawdzaniePromocji {

	public static void main(String[] args) {
		/*
		byte x = 5, y = 10;
		int z;
		z = x + y;
		System.out.println(z);
		 
		byte a = 70, b = 70;
		byte suma = (byte) (a+b);
		System.out.print(suma);
		
		int x = 4;
		long y = x * 4 - x++;
		if (y < 12)
			System.out.println("za ma?o");
		else
			System.out.println("w sam raz");
		*/
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z = false);
		System.out.println(x + ", " + y + ", " + z);
	}
}
