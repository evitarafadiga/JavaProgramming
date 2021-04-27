package capitulo06;

import java.util.Scanner;
/*
 * Escreva um m�todo squareOfAsterisks que exibe um quadrado s�lido (o mesmo n�mero de linhas e colunas) de asteriscos cujo 
 * lado � especificado no par�metro inteiro side. Por exemplo, se side for 4, o m�todo dever� exibir
 *	****
 *	****
 *	****
 *	****
 * Incorpore esse m�todo a um aplicativo que l� um valor inteiro para side a partir da entrada fornecida pelo usu�rio e gera 
 * sa�da dos asteriscos com o m�todo squareOfAsterisks.
 */

public class Questao618 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite a quantidade de asteriscos: %n");
		int side = input.nextInt();
		
		squareOfAsterisks(side);
	}

	public static void squareOfAsterisks(int side) {
		String astheriscs = "";
		
		for (int i = 0; i < side; i++) {
			
			for (int j = 0; j < side; j++) {
				astheriscs += "*";
			} 
			astheriscs+="\n";
			
			
		}
		System.out.printf("%s%n",astheriscs);
	}
}
