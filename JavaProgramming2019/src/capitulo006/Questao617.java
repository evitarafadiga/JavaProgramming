package capitulo006;

import java.util.Scanner;

/*
 * Escreva um m�todo isEven que utiliza o operador de resto (%) para determinar se um inteiro � par. 
 * O m�todo deve levar um argumento inteiro e retornar true se o n�mero inteiro for par, e false, 
 * caso contr�rio. Incorpore esse m�todo a um aplicativo que insere uma sequ�ncia de inteiros (um por vez) 
 * e determina se cada um � par ou �mpar.
 */

public class Questao617 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.printf("Digite um inteiro: %n");
		int num = input.nextInt();
		boolean b = false;
		if (isEven(num, b) == true) {
			System.out.printf("O n�mero � par.");
		}
		else
			System.out.printf("O n�mero � impar.");
		
	}
	
	public static boolean isEven (int num, boolean bool) {
		
		if (num%2 == 0) {
			return true;
		}
		return false;
	}

}
