package capitulo007;

public class Exercicio722 {

	public static void main(String[] args) {

		int chess [][] = new int [7][7];
		
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess.length; j++) {
				
				if (i >= 2 && i <= 5) 
					chess [i][j] = 8;
				if (j >= 2 && j <= 5)
					chess [i][j] = 8;
				if (i >=1 && i >= 5)
					chess[i][j] = 6;
				if (j >= 1 && j >= 6)
					chess[i][j] = 6;
					
					else {
						chess [i][j] = 2;
					}
			}
		}
		
		printArray(chess);
	}
	
	public static void printArray (int chess [][]) {
		
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess.length; j++) {
				if (j % 8 == 0)
					System.out.println("");
				
				System.out.printf("[%d] ",chess[i][j]);
			}
		}
		
	}

}
