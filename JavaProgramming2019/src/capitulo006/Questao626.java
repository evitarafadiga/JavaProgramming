package capitulo006;

import java.util.Scanner;
/*
 * Escreva um m�todo que recebe um valor inteiro e retorna o n�mero com seus d�gitos invertidos. Por exemplo, dado
 * o n�mero 7.631, o m�todo deve retornar 1.367. Incorpore o m�todo a um aplicativo que l� um valor a partir da 
 * entrada fornecida pelo usu�rio e exibe o resultado.

 */

public class Questao626 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.printf("Digite um n�mero: %n");
		int num = input.nextInt();
		
		invert(num);
	}

	public static void invert(int num) {
		
		char inv = (char) num;
		System.out.println(inv);
	}
}
