package capitulo006;

import java.util.Scanner;
 /*
 * Para arredondar números em casas decimais específicas, utilize uma instrução como y = Math.floor(x * 10 + 0.5) / 10;
 * 
 * que arredonda x para a casa decimal (isto é, a primeira posição à direita do ponto de fração decimal), 
 * ou y = Math.floor(x * 100 + 0.5) / 100;
 * 
 * que arredonda x para a casa centesimal (isto é, a segunda posição à direita do ponto de fração decimal). 
 * 
 * Escreva um aplicativo que defina quatro métodos para arredondar um número x de várias maneiras:
 * 
 * a) roundToInteger(number)
 * b) roundToTenths(number)
 * c) roundToHundredths(number)
 * d) roundToThousandths(number)
 * 
 * Para cada leitura de valor, seu programa deve exibir o valor original, o número arredondado para o inteiro mais 
 * próximo, o número arredondado para o décimo mais próximo, o número arredondado para o centésimo mais próximo e 
 * o número arredondado para o milésimo mais próximo.
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
