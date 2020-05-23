package capitulo005;

/*
 * Escreva uma instrução Java ou um conjunto de instruções Java para realizar cada uma das seguintes tarefas:
	
	a) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for. 
		Assuma que as variáveis de inteiro sum e count foram declaradas.
	
	b) Calcule o valor de 2.5 elevado à potência de 3, utilizando o método pow.
	
	c) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i. 
		Assuma que a variável i foi declarada, mas não foi inicializada. 
		Imprima apenas cinco inteiros por linha. 
		[Dica: utilize o cálculo i % 5. 
		Quando o valor dessa expressão for 0, imprima um caractere de nova linha; caso contrário, imprima um caractere de tabulação. 
		Assuma que esse código é um aplicativo. 
		Utilize o método System.out.println () para imprimir o caractere de nova linha, e utilize o método System.out.print ('\t') para
imprimir o caractere de tabulação.]

	d) Repita a parte (c) utilizando uma instrução for.

 */

public class Exercicio53 {

	public static void main(String[] args) {
		
		int sum = 1;
		for (int i = -1; i <= 99; i += 2) {
		sum += i;
		System.out.printf("O numero inteiro impar %d%n somado ao restante equivale a %d%n",i,sum);
			
		}
		

	}

}
