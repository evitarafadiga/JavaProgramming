package capitulo007;

import java.security.SecureRandom;

public class Exercicio722 {

	public static void main(String[] args) {

		int board[][] = new int[8][8];

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
		System.out.printf("\n");
		access(board,board);
		
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
	
	public static void access(int[][] spaces, int chess[][]) {
		
		for (int i = 0; i < spaces.length; i++) {
			for (int j = 0; j < spaces.length; j++) {
				spaces[i][j] = 0;
 			}
		}
		
		SecureRandom rand = new SecureRandom();
		int op = 0;
		for (int i = 3; i < spaces.length; i++) {
			for (int j = 4; j < spaces.length; j++) {
				
				
				op = rand.nextInt(7);
				
				switch (op){
				case 0:
					if (spaces[i+2][j-1] == 0 && chess[i+2][j-1] < chess[i+1][j-2]) {
						spaces[i+2][j-1] = 1;
					}
					else if (spaces[i+1][j-2] == 0 && chess[i+1][j-2] < chess[i-1][j-2]){
						spaces[i+1][j-2] = 1;
					}	
					break;
				case 1:
					if (spaces[i+1][j-2] == 0) {
						spaces[i+1][j-2] = 1;
					}
					else if (spaces[i+1][j-2] == 0){
						spaces[i-1][j-2] = 1;
					}		
					default:
						break;
					
				}
				
			}
		}
	printArray(spaces);
	}

}
