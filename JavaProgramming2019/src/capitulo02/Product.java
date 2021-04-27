package capitulo02;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		//cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int result;
		
		System.out.print("Insira o primeiro inteiro: ");
		x = input.nextInt();
		
		System.out.print("Insira o segundo inteiro: ");
		y = input.nextInt();
		
		System.out.print("Insira o terceiro inteiro: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf("Produto equivale a %d%n", result);
		
	}

}
