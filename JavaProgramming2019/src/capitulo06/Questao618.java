package capitulo06;

import java.util.Scanner;
/*
 * Escreva um método squareOfAsterisks que exibe um quadrado sólido (o mesmo número de linhas e colunas) de asteriscos cujo 
 * lado é especificado no parâmetro inteiro side. Por exemplo, se side for 4, o método deverá exibir
 *	****
 *	****
 *	****
 *	****
 * Incorpore esse método a um aplicativo que lê um valor inteiro para side a partir da entrada fornecida pelo usuário e gera 
 * saída dos asteriscos com o método squareOfAsterisks.
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
