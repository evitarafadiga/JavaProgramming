package capitulo007;

import java.security.SecureRandom;

public class Exercicio720 {

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();
		
		final int PRODUCT_TYPE = 7;
		final int VENDOR = 6;
		
		Double [][] sales = new Double [PRODUCT_TYPE][VENDOR];
		double total = 0.0;
		
		for (int i = 0; i < PRODUCT_TYPE; i++) {
			
			for (int j = 0; j < VENDOR; j++) {
				sales [i][j] = (double) rand.nextInt(50);		
				total += sales[i][j];
			}
		}
		
		printArray(sales);
		System.out.println("\n");
		System.out.printf("Valor TOTAL %f%n",total);
	}
	
	public static void printArray (Double[][] sales) {
		
		for (int i = 0; i < 7; i++) {
			
			for (int j = 0; j < 6; j++) {
				
				if (j % 7 == 0) 
					System.out.printf("%n");
				if (j == 0 && i < 1)
					System.out.printf(" [%10s ] ","Vendas");
				if (j == 1 && i < 1)
					System.out.printf(" [%10s ] ","Jessica");
				if (j == 2 && i < 1)
					System.out.printf(" [%10s ] ","Morty");
				if (j == 3 && i < 1)
					System.out.printf(" [%10s ] ","Geralt");
				if (j == 4 && i < 1)
					System.out.printf(" [%10s ] ","Enola");
				if (j == 5 && i < 1)
					System.out.printf(" [%10s ] ","TOTALPROD");
				if (i == 1 && j < 1)
					System.out.printf(" [%10s ] ","E-Books");
				if (i == 2 && j < 1)
					System.out.printf(" [%10s ] ","USB Stick");
				if (i == 3 && j < 1)
					System.out.printf(" [%10s ] ","Server");
				if (i == 4 && j < 1)
					System.out.printf(" [%10s ] ","E-Reader");
				if (i == 5 && j < 1)
					System.out.printf(" [%10s ] ","Hardware");
				if (i == 6 && j < 1)
					System.out.printf(" [%10s ] ","TOTALVEND");
				
				else
					if (i > 1 && j > 1)
				System.out.printf(" [%8s R$] ",sales[i][j]);
			}
			
		}
	}

}
