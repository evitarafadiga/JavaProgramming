package capitulo07;

public class Exercicio711 {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 9;
		int [] count = new int[ARRAY_SIZE];
		
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		
		int [] bonus = new int[15];
		int [] bestScores = new int [ARRAY_SIZE];
		
		displayArray("Array Best Score",bestScores);
	}

	public static void displayArray(String description, int[] bestScores) {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d ",bestScores[i]);
			System.out.println();
		}
		
	}
	
}
