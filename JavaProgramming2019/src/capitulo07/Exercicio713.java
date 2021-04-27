package capitulo07;

public class Exercicio713 {

	public static void main(String[] args) {
		int [][] sales = new int[3][5];
		
		for (int row = 0; row < sales.length; row++) {
		for (int col = 0; col < sales[row].length; col++) {
		sales[row][col] = 0;
		
			}
		}
		
		printArray(sales);
		
	}
	
	public static void printArray(int [][] sales) {
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales.length; j++) {
				if(i % 2 == 0)
				System.out.printf("%n");
				System.out.printf("[%d]%n", sales[i][j]);
			}
			
		}
	}	
}
