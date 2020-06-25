package capitulo006;

import java.util.Scanner;
/*
 * Um n�mero inteiro positivo � primo se for divis�vel apenas por 1 e por ele mesmo. Por exemplo, 2, 3, 5 e 7 s�o primos,
 * mas 4, 6, 8 e 9 n�o s�o. O n�mero 1, por defini��o, n�o � primo.
 * 
 * a) Escreva um m�todo que determina se um n�mero � primo.
 * b) Utilize esse m�todo em um aplicativo que determina e exibe todos os n�meros primos menores que 10.000. Quantos 
 * n�meros at� 10.000 voc� precisa testar a fim de assegurar que encontrou todos os primos?
 * c) Inicialmente, voc� poderia pensar que n/2 � o limite superior que deve ser testado para ver se um n�mero � primo,
 * mas voc� precisa ir apenas at� a raiz quadrada de n. Reescreva o programa e execute-o de ambas as maneiras.
 */
public class Questao625 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Insira um numero: %n");
		int num = input.nextInt();
		
		primo(num);
	}
	
	public static void primo(int num) {
		for (int i = 3; i <= num; i++) {
			if (num == i) {
				System.out.printf("O numero %d � primo!.",num);
				break;
			} else {
				i+=1;
				System.out.printf("O numero %d N�O � primo!.",num);
			}
			
			
		}
	}
}
