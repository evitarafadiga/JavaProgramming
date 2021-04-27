package capitulo06;

import java.util.Scanner;

/*
 *  Escreva um método isMultiple que determina um par de inteiros se o segundo inteiro for um múltiplo do primeiro. 
 *  O método deve aceitar dois argumentos inteiros e retornar true se o segundo for um múltiplo do primeiro e false 
 *  caso contrário. [Dica: utilize o operador de módulo.] 
 *  Incorpore esse método a um aplicativo que insere uma série de pares inteiros (um par por vez) e determina se o 
 *  segundo valor em cada par é um múltiplo do primeiro.
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
			System.out.printf("O numero inteiro %d é SIM múltiplo do primeiro numero %d%n",n2,n1);
			return true;	
		}
		System.out.printf("O numero inteiro %d NAO é múltiplo do primeiro numero %d%n",n2,n1);
		return false;
	}
}
