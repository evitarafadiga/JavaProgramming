package capitulo07;

public class EnhancedForTest {

	public static void main(String[] args) {

		int[] array = { 99, 100, 98, 97, 95, 96, 94, 93, 92, 91, 90 };
		int total = 0;
		
		for (int number : array)
			total += number;
		
		System.out.printf("Total de elementos do vetor equivale a: %d%n",total);
	}

}
