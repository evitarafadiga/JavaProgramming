package capitulo06;

import java.util.Scanner;
/*
 * Escreva um m�todo integerPower(base, exponent) que retorne o valor de exponente base ^ exponente
 * Por exemplo, integerPower(3, 4) calcula 34 (ou 3 * 3 * 3 * 3). Suponha que exponent seja um inteiro 
 * n�o zero, positivo, e base, um inteiro. Use uma instru��o for ou while para controlar o c�lculo. * 
 * N�o utilize m�todos da classe Math. Incorpore esse m�todo a um aplicativo que l� os valores inteiros 
 * para base e exponent e realiza o c�lculo com o m�todo integerPower.
 */

public class Questao614 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Insira a base: %n");
		int base = input.nextInt();
		System.out.printf("Insira o expoente: %n");
		int exponent = input.nextInt();
		integerPower(base,exponent);
	}
	
	public static void integerPower(int base, int exponent) {
		int x = base;
		for (int i = 1; i < exponent; i++) {
			x *= base;
		}
		
		System.out.printf("O numero %d elevado a %d� potencia equivale a: %d",base,exponent,x);
		
	}

}
