package CwiczeniaZPolskoJaponskiej;

class Zad08PPCwiczenia06 {
    public static void main(String args[]) {
        int tablica[][] = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 2, 1}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    if (tablica[i][j] == 0);
                       else {
                        System.out.println("To nie jest tablica diagonalna");
                    }

                }

            }
        }
    }
}
