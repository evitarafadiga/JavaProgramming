package capitulo007;

import java.util.Scanner;

public class Exercicio715 {

	public static void main(String[] args) {
		System.out.printf("Insira o tamanho do array em um inteiro: %n");
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		if (t <= 0)
			System.out.printf("Array de tamanho ou menor que zero definido%n");
		else {
			int [] array = new int[t];
			
			System.out.printf("%s%8s%n", "Index", "Value");
			 
			for 
			 (int counter = 0; counter < array.length; counter++)
			
			 System.out.printf("%5d%8d%n", counter, array[counter]);
			 
		}

	}

}
