package capitulo006;

import java.util.Scanner;
 /*
 * Para arredondar n�meros em casas decimais espec�ficas, utilize uma instru��o como y = Math.floor(x * 10 + 0.5) / 10;
 * 
 * que arredonda x para a casa decimal (isto �, a primeira posi��o � direita do ponto de fra��o decimal), 
 * ou y = Math.floor(x * 100 + 0.5) / 100;
 * 
 * que arredonda x para a casa centesimal (isto �, a segunda posi��o � direita do ponto de fra��o decimal). 
 * 
 * Escreva um aplicativo que defina quatro m�todos para arredondar um n�mero x de v�rias maneiras:
 * 
 * a) roundToInteger(number)
 * b) roundToTenths(number)
 * c) roundToHundredths(number)
 * d) roundToThousandths(number)
 * 
 * Para cada leitura de valor, seu programa deve exibir o valor original, o n�mero arredondado para o inteiro mais 
 * pr�ximo, o n�mero arredondado para o d�cimo mais pr�ximo, o n�mero arredondado para o cent�simo mais pr�ximo e 
 * o n�mero arredondado para o mil�simo mais pr�ximo.
 * 
 */

public class Questao610 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.printf("Insira o numero com casa decimal especifica a ser arredondada: %n");
		
		double num = input.nextDouble();
		
		roundToInteger(num);
		roundToTenths(num);
		roundToHundredths(num);
		roundToThousandths(num);
		
	}
	
	public static void roundToInteger(double num) {
		
		double arr = Math.floor(num + 0.5);
		
		System.out.printf("O resultado do arredondamento de %f equivale a: %f%n",num,arr);
		
	}
	
	public static void roundToTenths(double num) {
		
		double arr = Math.floor(num * 10 + 0.5) / 10;
		
		System.out.printf("O resultado do arredondamento de %f equivale a: %f%n",num,arr);
	}
	
	public static void roundToHundredths(double num) {
		
		double arr = Math.floor(num * 100 + 0.5) / 100;
		
		System.out.printf("O resultado do arredondamento de %f equivale a: %f%n",num,arr);
	}
	
	public static void roundToThousandths(double num) {
		
		double arr = Math.floor(num * 1000 + 0.5) / 1000;
		
		System.out.printf("O resultado do arredondamento de %f equivale a: %f%n",num,arr);
	}

}
