package capitulo007;

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
		boolean b;
		
		for (int i = 0; i < value.length; i++) {
			System.out.printf("%d%n",value[i]);
		}
		
		if (b = Arrays.equals(value, check))
		System.out.printf("%nintArray %s filledIntArray%n",
		(b ? "==" : "!="));
	}
}
