package capitulo006;

import java.util.Scanner;
/*
 * Escreva um método que recebe um valor inteiro e retorna o número com seus dígitos invertidos. Por exemplo, dado
 * o número 7.631, o método deve retornar 1.367. Incorpore o método a um aplicativo que lê um valor a partir da 
 * entrada fornecida pelo usuário e exibe o resultado.

 */

public class Questao626 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.printf("Digite um número: %n");
		int num = input.nextInt();
		
		invert(num);
	}

	public static void invert(int num) {
		
		char inv = (char) num;
		System.out.println(inv);
	}
}
