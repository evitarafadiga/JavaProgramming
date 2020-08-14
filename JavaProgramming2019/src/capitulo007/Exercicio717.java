package capitulo007;

import java.security.SecureRandom;

public class Exercicio717 {

	public static void main(String[] args) {
		int [] array = new int[36000000];
		
		SecureRandom rand = new SecureRandom();
		
		for (int i = 0; i < array.length; i++) {
			array [i] = 2 + rand.nextInt(6) + rand.nextInt(6);
			
		}
		outbarChart(array);
		
	}
	
	public static void outbarChart(int [] array) {
		int[] frequency = new int[13];
		
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 2:
				++frequency[2];
			case 3:
				++frequency[3];
			case 4:
				++frequency[4];
			case 5:
				++frequency[5];
			case 6:
				++frequency[6];
			case 7:
				++frequency[7];
			case 8:
				++frequency[8];
			case 9:
				++frequency[9];
			case 10:
				++frequency[10];
			case 11:
				++frequency[11];
			case 12:
				++frequency[12];
			break;
			}
			
		}
		 
		
		for (int count = 2; count < frequency.length; count++) {
			
			if (count == 12)
				System.out.printf("%2d: ", 12);
				else
				System.out.printf("%2d: ", count);
				
			for (int stars = 0; stars < frequency[count]; stars++)
				if (stars % 600 == 0)
				System.out.print("*");
				System.out.println();

		}
		
		for (int i = 0; i < array.length; i++) {
			
			
			if (i % 30 == 0)
				System.out.println();
			System.out.printf(" %3d ", array[i]);
			
			
		}
	}

}
