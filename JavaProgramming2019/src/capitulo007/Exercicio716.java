package capitulo007;

import java.util.Scanner;

public class Exercicio716 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite os números a serem somados: %n");
		
		while (input.hasNext()) {
			
			double d = input.nextDouble();
			System.out.println();
			sum(d);
		}
		
		
	}
	
	public static double sum(double... numbers) {
		double total = 0.0;
		
		for (double d : numbers) {
			total += d;
		}
		return total;
	}

}
