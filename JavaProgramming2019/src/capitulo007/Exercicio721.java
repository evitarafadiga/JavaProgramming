package capitulo007;

import java.security.SecureRandom;

public class Exercicio721 {
	
	private static final SecureRandom rand = new SecureRandom();
	
	private enum Status { CONTINUE, STOP };
	private static final int DONTDRAW = 1;
	private static final int DRAW = 2;
	private static final int RIGHT = 3;
	private static final int LEFT = 4;
	private static final int ADVANCE_RANDOM = 5 ;
	private static final int UP = 6;
	private static final int DOWN = 7;
	private static final int SENTINEL = 9;
	
	public static void main (String[] args) { 
		
		int floor [][] = new int [20][20];
		// iniciar como zero
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < floor.length; j++) {
				floor [i][j] = 0;
			}
		}
		
		
		// distribuir asteriscos por comando
		for (int i = 9; i < floor.length; i++) {
			for (int j = 9; j < floor.length; j++) {
				
				Status turtleStatus = null;
				int act = rand.nextInt(2);
				int paint = command();
				
				if (act == 1) {
					
					switch(paint) {
					case DONTDRAW:
						turtleStatus = Status.CONTINUE;
					case DRAW:
						floor[i][j] = 1;
						turtleStatus = Status.CONTINUE;
					case RIGHT:
						floor[i][j+1] = 1;
						turtleStatus = Status.CONTINUE;
					case LEFT:
						floor[i][j-1] = 1;
						turtleStatus = Status.CONTINUE;
					case ADVANCE_RANDOM:
						floor[i+rand.nextInt(3)][j+rand.nextInt(3)] = 1;
						turtleStatus = Status.CONTINUE;
					case UP:
						floor[i-1][j] = 1;
						turtleStatus = Status.CONTINUE;
					case DOWN:
						floor[i+1][j] = 1;
						turtleStatus = Status.CONTINUE;
					case SENTINEL:
						turtleStatus = Status.STOP;
						break;
					default:
						turtleStatus = Status.CONTINUE;
						break;
		
					}
				}
				if (act == 2) {
					switch(paint) {
					case DONTDRAW:
						turtleStatus = Status.CONTINUE;
					case DRAW:
						floor[i][j] = 1;
						turtleStatus = Status.CONTINUE;
					case RIGHT:
						floor[i][j+1] = 0;
						turtleStatus = Status.CONTINUE;
					case LEFT:
						floor[i][j-1] = 0;
						turtleStatus = Status.CONTINUE;
					case ADVANCE_RANDOM:
						floor[i+rand.nextInt(3)][j+rand.nextInt(3)] = 0;
						turtleStatus = Status.CONTINUE;
					case UP:
						floor[i-1][j] = 0;
						turtleStatus = Status.CONTINUE;
					case DOWN:
						floor[i+1][j] = 0;
						turtleStatus = Status.CONTINUE;
					case SENTINEL:
						turtleStatus = Status.STOP;
						break;
					default:
						turtleStatus = Status.CONTINUE;
						break;
		
					}
					
				}
				while (turtleStatus == Status.CONTINUE) {
					paint = command();
				
				}
				
				if (turtleStatus == Status.STOP) {
					printArray(floor);
					break;
				}
			}
				
		}
		
	}
	
	public static int command() {
		
		int command = rand.nextInt(9); 
		
		return command; 
	}
	
	public static void printArray (int floor [][]) {
		
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < floor.length; j++) {
				if (j % 20 == 0)
					System.out.printf("\n");
				
				if (floor [i][j] == 1) {
					System.out.printf("[%s] ","*");
				}
				else if (floor [i][j] == 0){
					System.out.printf("[ ] ");
				}
			}
		}
	}

}
