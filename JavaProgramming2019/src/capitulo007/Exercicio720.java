package capitulo007;

public class Exercicio720 {

	public static void main(String[] args) {
		final int VENDOR = 4;
		final int PRODUCT_TYPE = 5;
		String [][] sales = new String [PRODUCT_TYPE][VENDOR];
		
		for (int i = 0; i < PRODUCT_TYPE; i++) {
			
			for (int j = 0; j < VENDOR; j++) {
				sales [i][j] = "0,50 R$";		
						
			}
		}
		
		sales [2][1] = "6,22 R$";
		
		printArray(sales);

	}
	
	public static void printArray(String [][] sales) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (j % 4 == 0) System.out.printf("%n");
				System.out.printf(" [%.10s] ",sales[i][j]);
			}
			
		}
	}

}
