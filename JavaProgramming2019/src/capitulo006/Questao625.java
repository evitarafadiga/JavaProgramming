package capitulo006;

import java.util.Scanner;
/*
 * Um número inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. Por exemplo, 2, 3, 5 e 7 são primos,
 * mas 4, 6, 8 e 9 não são. O número 1, por definição, não é primo.
 * 
 * a) Escreva um método que determina se um número é primo.
 * b) Utilize esse método em um aplicativo que determina e exibe todos os números primos menores que 10.000. Quantos 
 * números até 10.000 você precisa testar a fim de assegurar que encontrou todos os primos?
 * c) Inicialmente, você poderia pensar que n/2 é o limite superior que deve ser testado para ver se um número é primo,
 * mas você precisa ir apenas até a raiz quadrada de n. Reescreva o programa e execute-o de ambas as maneiras.
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
				System.out.printf("O numero %d É primo!.",num);
				break;
			} else {
				i+=1;
				System.out.printf("O numero %d NÃO é primo!.",num);
			}
			
			
		}
	}
}
