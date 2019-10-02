package exercicios;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int soma;
		
			System.out.print("Insira o primeiro número: ");
			num1 = input.nextInt();
			
			System.out.print("Insira o segundo número: ");
			num2 = input.nextInt();
			
			soma = num1 + num2;
			
			System.out.printf("A soma equivale a: %d%n",soma);
	}

}
