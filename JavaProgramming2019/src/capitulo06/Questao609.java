package capitulo06;

import java.util.Scanner;

/*
 * (Arredondando n�meros) Math.floor pode ser utilizado para arredondar valores ao n�mero inteiro mais 
 * pr�ximo � por exemplo, y = Math.floor(x + 0.5);
 * arredondar� o n�mero x para o inteiro mais pr�ximo e atribuir� o resultado a y. Escreva um aplicativo 
 * que l� valores double e utiliza a instru��o anterior para arredondar cada um dos n�meros para o 
 * inteiro mais pr�ximo. 
 * 
 * Para cada n�mero processado, exiba ambos os n�meros, o original e o arredondado.
 */

public class Questao609 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite o numero a ser arredondado: %n");
		double num = input.nextDouble();
		
		double arr = Math.floor(num + 0.5);
		
		System.out.printf("O resultado do arredondamento de %f equivale a: %f%n",num,arr);
		

	}

}
