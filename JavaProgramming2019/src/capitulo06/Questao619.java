package capitulo06;

import java.util.Scanner;

/*
 * Modifique o m�todo criado no Exerc�cio 6.18 para receber um segundo par�metro do tipo char chamado fillCharacter . 
 * Forme o quadrado utilizando o char fornecido como um argumento. Portanto, se side for 5 e fillCharacter for #, o 
 * m�todo deve exibir
 * #####
 * #####
 * #####
 * #####
 * #####
 * Utilize a seguinte instru��o (em que input � um objeto Scanner) para ler um caractere do usu�rio no teclado:
 * char fill = input.next().charAt(0);
 */

public class Questao619 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite a quantidade de simbolos: %n");
		int side = input.nextInt();
		System.out.printf("Digite agora o simbolo desejado: %n");
		char fill = input.next().charAt(0);
		
		fillCharacter(side,fill);
	}
	
	public static void fillCharacter (int side, char fill) {
		String astheriscs = "";
		
		for (int i = 0; i < side; i++) {
			
			for (int j = 0; j < side; j++) {
				astheriscs += fill;
			} 
			astheriscs+="\n";
			
			
		}
		System.out.printf("%s%n",astheriscs);
	}
}
