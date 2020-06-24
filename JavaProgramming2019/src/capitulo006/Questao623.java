package capitulo006;

import java.util.Scanner;
/*
 * Escreva um método minimum3 que retorna o menor dos três números de ponto flutuante. Utilize o método Math.
 * min para implementar minimum3. Incorpore o método a um aplicativo que lê três valores do usuário, determina 
 * o menor valor e exibe o resultado.
 */

public class Questao623 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.printf("Digite o primeiro numero de ponto flutuante: %n");
	float n1 = input.nextFloat();
	System.out.printf("Digite o segundo numero de ponto flutuante: %n");
	float n2 = input.nextFloat();
	System.out.printf("Digite o terceiro numero de ponto flutuante: %n");
	float n3 = input.nextFloat();
	
	minimum3(n1,n2,n3);
	}

	public static void minimum3(float n1, float n2, float n3) {
		float min = Math.min(n1,n2);
		min = Math.min(min,n3);
		
		System.out.printf("O menor valor entre [%f], [%f] e [%f] é : [%f].%n",n1,n2,n3,min);
	}
}
