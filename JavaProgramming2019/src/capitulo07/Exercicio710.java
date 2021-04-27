package capitulo07;

import java.security.SecureRandom;

public class Exercicio710 {

	public static void main(String[] args) {

		float [] count = new float [9];
		int [] bonus = new int [9];
		SecureRandom rand = new SecureRandom();
		for (int i = 0; i < count.length; i++) {
			count[i] = rand.nextInt(1000);
		}
		
		calculaVenda(count,bonus,"Vendedor xis");

	}
	
	public static void calculaVenda( float[] count, int[] bonus, String description) {
		
		for (int i = 0; i < count.length; i++) {
			 bonus [i] = (int) ((count[i]) + count[i] * 0.9) +  200;
			 
			 
				System.out.printf("%s%nValor bruto: %f%n Valor líquido: %-19d",description,count[i],bonus[i]);
				if (i % 2 == 0) {
					System.out.println();
				}
		}
		
	
	}

}
