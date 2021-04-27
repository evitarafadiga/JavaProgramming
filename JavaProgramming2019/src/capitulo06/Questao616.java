package capitulo06;

import java.util.Scanner;

/*
 *  Escreva um m�todo isMultiple que determina um par de inteiros se o segundo inteiro for um m�ltiplo do primeiro. 
 *  O m�todo deve aceitar dois argumentos inteiros e retornar true se o segundo for um m�ltiplo do primeiro e false 
 *  caso contr�rio. [Dica: utilize o operador de m�dulo.] 
 *  Incorpore esse m�todo a um aplicativo que insere uma s�rie de pares inteiros (um par por vez) e determina se o 
 *  segundo valor em cada par � um m�ltiplo do primeiro.
 */
public class Questao616 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Insira o primeiro inteiro: %n");
		int n1 = input.nextInt();
		System.out.printf("Insira o segundo inteiro: %n");
		int n2 = input.nextInt();
		boolean b = false;
		
		isMultiple(n1,n2,b);
		
	}
	
	public static boolean isMultiple(int n1, int n2, boolean b) {

		if (n2 % n1 == 0) {
			System.out.printf("O numero inteiro %d � SIM m�ltiplo do primeiro numero %d%n",n2,n1);
			return true;	
		}
		System.out.printf("O numero inteiro %d NAO � m�ltiplo do primeiro numero %d%n",n2,n1);
		return false;
	}
}
