package capitulo07;

import java.util.Scanner;

public class Exercicio716 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite os números a serem somados ou -1 para terminar: %n");
		
		double array [] = new double [100];
		for (int i = 0; input.hasNext(); i++) {
			array[i] = input.nextDouble();
			if (array[i] == -1)
				System.out.printf("A soma equivale a %f%n", sum(array) + 1);
				
				
			System.out.printf("Soma atual %f%n",sum(array));
			
		}
		sum(array);

	}
	
	public static double sum(double... numbers) {
		
		double total = 0.0;
		
		for (double d : numbers) {
			
			total += d;
		}
		
		return total;
		
	}

}
