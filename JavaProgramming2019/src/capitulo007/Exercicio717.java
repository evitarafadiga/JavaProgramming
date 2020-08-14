package capitulo007;

import java.security.SecureRandom;

public class Exercicio717 {

	public static void main(String[] args) {
		int [] array = new int[360];
		
		SecureRandom rand = new SecureRandom();
		
		for (int i = 0; i < array.length; i++) {
			array [i] = 2 + rand.nextInt(6) + rand.nextInt(6);
			
		}
		outbarChart(array);
		
	}
	
	public static void outbarChart(int [] array) {
		int[] frequency = new int[7];
		int a = 8;
		
		for (int face : array)
		 ++frequency[(face/2)];
		
		for (int count = 0; count < frequency.length; count++) {
			
			if (count == 12)
				System.out.printf("%5d: ", 12);
				else
				System.out.printf("%2d: ", a--);
				
			for (int stars = 0; stars < frequency[count]; stars++)
				System.out.print("*");
				System.out.println();

		}
		
		for (int i = 0; i < array.length; i++) {
			
			if (i == 0) System.out.println();
			
			System.out.printf(" %3d ", array[i]);
			
			if (i % 30 == 0)
				System.out.println();
		}
	}

}
