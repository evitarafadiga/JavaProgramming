package capitulo007;

public class Exercicio722 {

	public static void main(String[] args) {

		int board[][] = new int[8][8];
		int currentRow [] = new int [8];
		int currentColumn [] = new int [8];
		int moveNumber = 0;

		for (int j = 0; j < board.length; j++) {
			for (int i = 0; i < board.length; i++) {
				if (i <= 0) {
					board[i][j] = 2;
				}
				if (i >= 1 && i <= 6) {
					board[i][j] = 3;
				}
				if (j >= 1 && j <= 6) {
					board[i][j] = 3;
				}
				if (i >= 2 && i <= 5) {
					board[i][j] = 4;
				}
				if (j >= 2 && j <= 5) {
					board[i][j] = 4;
				}
				
				if (i >= 1 && j >= 1 && i <= 6 && j <= 6) {
					board[i][j] = 6;
				}
				if (i >= 2 && j >= 2 && i <= 5 && j <= 5) {
					board[i][j] = 8;
				}
				// distribute n4
				if (i == 1 && j == 1) {
					board[i][j] = 4;
				}
				if (i == 6 && j == 6) {
					board[i][j] = 4;
				}
				if (i == 6 && j == 1) {
					board[i][j] = 4;
				}
				if (i == 1 && j == 6) {
					board[i][j] = 4;
				}
				
				if (i >=7 && j >=7) {
					board[i][j] = 2;
				}
				if (i >=7 && j >=2 && j<=5) {
					board[i][j] = 4;
				}
				if (i >=7 && j <=0) {
					board[i][j] = 2;
				}
			}
		}

		printArray(board);
		
	}

	public static void printArray(int chess[][]) {

		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess.length; j++) {
				if (j % 8 == 0)
					System.out.println("");

				System.out.printf("[%d] ", chess[i][j]);
			}
		}

	}

}
