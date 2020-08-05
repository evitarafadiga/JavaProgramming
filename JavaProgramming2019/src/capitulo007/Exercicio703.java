package capitulo007;

public class Exercicio703 {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 10;
		double[] fractions = new double[ARRAY_SIZE];
		
		fractions[9] = 1.667;
		fractions[6] = 3.333;
		double total = 0;
		for (int j = 0; j < fractions.length; j++) {
			total += fractions[j];
			System.out.printf("%.3f%n",fractions[j]);
		}
			
		
		
	}

}
