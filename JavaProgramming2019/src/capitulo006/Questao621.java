package capitulo006;

import java.util.Scanner;
/*
 * 6.21 Escreva m�todos que realizam cada uma das seguintes tarefas:
 * a) Calcule a parte inteiro do quociente quando o inteiro a � dividido pelo inteiro b.
 * b) Calcule o resto inteiro quando o inteiro a � dividido por inteiro b.
 * c) Utilize m�todos desenvolvidos nas partes (a) e (b) para escrever um m�todo displayDigits que recebe um 
 * inteiro entre 1 e 99999 e o exibe como uma sequ�ncia de d�gitos, separando cada par de d�gitos por dois espa�os. 
 * Por exemplo, o inteiro 4562 deve aparecer como
 * 4
 * 5
 * 6
 * 2
 * 
 * Incorpore os m�todos em um aplicativo que insere um n�mero inteiro e chama displayDigits passando para o m�todo 
 * o n�mero inteiro inserido. Exiba os resultados.
 */

public class Questao621 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Insira o inteiro entre 1 e 99999: %n");
		int num = input.nextInt();
		
		displayDigits(num);
	}

	public static void displayDigits (int num) {
		double decmi = Math.abs(num/ 10000);
		if (decmi > 0)
		System.out.printf("%.0f%n",decmi);
		
		double mil = Math.abs(num/1000);
		//if (mil > 0)
		System.out.printf("%.0f%n",mil);
		
		double cent = Math.abs(num/100);
		//if (cent > 0)
		System.out.printf("%.0f%n",cent);
		
		double dec = Math.abs(num/10);
		//if (dec > 0)
		System.out.printf("%.0f%n",dec);
		
		double unit = Math.abs(num%10000);
		//if (unit > 0)
		System.out.printf("%.0f%n",unit);
	}
	
}
