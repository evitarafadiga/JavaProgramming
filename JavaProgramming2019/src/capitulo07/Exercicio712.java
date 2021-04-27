package capitulo07;

import java.security.SecureRandom;
import java.util.Arrays;

public class Exercicio712 {

	public static void main(String[] args) {
		int [] c = new int [5];
		int [] cd = new int [c.length];
		SecureRandom rand = new SecureRandom();

		for (int i = 0; i < c.length; i++) {
			c [i] = rand.nextInt(100-10);
		}
		System.arraycopy(c, 0, cd, 0, c.length);
				

		exibe(c,cd);
	}

	public static void exibe(int[] value, int[] check) {
		int temp = 0;
		boolean b;
		for (int i = 0; i < value.length-1; i++) {
			for (int j = 0; j < value.length-1-i; j++) {
				if (value[j] > value[j+1]) {
					temp = value [j];
					value[j] = value[j+1];
					value[j+1] = temp;
					b = false;
					System.out.printf("[ %d ] %n",value[j]);				
				}
				
			}
			
		}
		
	}
}
