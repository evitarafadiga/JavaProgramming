package capitulo06;

import java.util.Scanner;

/*
 * (Arredondando números) Math.floor pode ser utilizado para arredondar valores ao número inteiro mais 
 * próximo — por exemplo, y = Math.floor(x + 0.5);
 * arredondará o número x para o inteiro mais próximo e atribuirá o resultado a y. Escreva um aplicativo 
 * que lê valores double e utiliza a instrução anterior para arredondar cada um dos números para o 
 * inteiro mais próximo. 
 * 
 * Para cada número processado, exiba ambos os números, o original e o arredondado.
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
