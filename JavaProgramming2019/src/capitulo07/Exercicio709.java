package capitulo07;

import java.security.SecureRandom;

public class Exercicio709 {

	public static void main(String[] args) {
		final int LINES = 2;
		final int COLUMNS = 3;
		int [][] t = new int [LINES][COLUMNS];
		SecureRandom rand = new SecureRandom();
	
		for (int j = 0; j < LINES; j++) {
			for (int k = 0; k < COLUMNS; k++) {
				t [j][k] = rand.nextInt(1000);
			}
		}
		displayLine("Array t", t);
		displayArray("Array t",t);
	}

	public static void displayLine (String string, int[][] t) {
		for (int i = 0; i < t.length; i++) {
			
			System.out.printf("%d%n",t[0][0]);
		}
	}
	
	public static void displayArray(String string, int[][] t) {
		System.out.printf("%n%s: ", string);
		for (int i = 0; i < t.length; i++) {
			if (i % 2 == 0)
				System.out.println();
			for (int j = 0; j < t.length; j++) {
				if (j % 2 == 0)
					System.out.println();
				System.out.printf("%-19d ", t[i][j]);
			}
		}
			
	}
}
