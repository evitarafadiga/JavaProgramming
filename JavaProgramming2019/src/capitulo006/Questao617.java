package capitulo006;

import java.util.Scanner;

/*
 * Escreva um método isEven que utiliza o operador de resto (%) para determinar se um inteiro é par. 
 * O método deve levar um argumento inteiro e retornar true se o número inteiro for par, e false, 
 * caso contrário. Incorpore esse método a um aplicativo que insere uma sequência de inteiros (um por vez) 
 * e determina se cada um é par ou ímpar.
 */

public class Questao617 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.printf("Digite um inteiro: %n");
		int num = input.nextInt();
		boolean b = false;
		if (isEven(num, b) == true) {
			System.out.printf("O número é par.");
		}
		else
			System.out.printf("O número é impar.");
		
	}
	
	public static boolean isEven (int num, boolean bool) {
		
		if (num%2 == 0) {
			return true;
		}
		return false;
	}

}
