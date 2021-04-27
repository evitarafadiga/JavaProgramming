package capitulo07;

public class InitArray {

	public static void main(String[] args) {

		int[][] array1 = {{1, 2, 3},{4,5,6}};
		int[][] array2 = {{1, 2},{3}, {4, 5, 6}};
		
		System.out.println("Valores de vetor array1 por linha sao: ");
		outputArray(array1);
		
		System.out.printf("%nValores de vetor array2 por linha sao: ");
		outputArray(array2);
		
	}
	
	public static void outputArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++)
				System.out.printf("%d ", array[row][column]);
			
			System.out.println();
			
		}
	}
	
}
