package capitulo007;

import java.security.SecureRandom;

public class Exercicio720 {

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();
		final int VENDOR = 5;
		final int PRODUCT_TYPE = 6;
		
		String [][] sales = new String [PRODUCT_TYPE][VENDOR];
		
		for (int i = 1; i < PRODUCT_TYPE; i++) {
			
			for (int j = 1; j < VENDOR; j++) {
				sales [i][j] = rand.nextDouble() + " R$";		
						
			}
		}
		sales [0][0] = "VENDAS";
		
		sales [0][1] = "July";
		sales [0][2] = "Robert";
		sales [0][3] = "Vincent";
		sales [0][4] = "Carmen";
		sales [1][0] = "Shampoo";
		sales [2][0] = "Chocolate";
		sales [3][0] = "DVD";
		sales [4][0] = "USB Stick";
		sales [5][0] = "Sorvete";
		
		printArray(sales);
		System.out.println();
		sumSales(sales);

	}
	
	public static void printArray (String [][] sales) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (j % 5 == 0) System.out.printf("%n");
				if (j < 1)
					System.out.printf(" [%10s] ",sales[i][j]);
				else
				System.out.printf(" [%23s] ",sales[i][j]);
			}
			
		}
	}
	
	public static void sumSales (String [][] sales) {
		double sumVendor = 0.0;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 5; j++) {
				if (j % 5 == 0) System.out.printf("%n");
				
				sumVendor = Double.parseDouble(sales[i][j]);
				
			}
			
		}
		System.out.printf("%f",sumVendor);
		
	}

}
