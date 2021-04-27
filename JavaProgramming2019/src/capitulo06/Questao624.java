package capitulo06;

import java.util.Scanner;
/*
 * Dizemos que um n�mero inteiro � um n�mero perfeito se a soma de seus fatores, incluindo 1 (mas n�o o pr�prio
 * n�mero), for igual ao n�mero. Por exemplo, 6 � um n�mero perfeito porque 6 = 1 + 2 + 3. Escreva um m�todo 
 * isPerfect que determina se par�metro number � um n�mero perfeito. Utilize esse m�todo em um applet que 
 * determina e exibe todos os n�meros perfeitos entre 1 e 1.000. 
 * 
 * Exiba os fatores de cada n�mero perfeito confirmando que ele � de fato perfeito. Desafie o poder de computa��o 
 * do seu computador testando n�meros bem maiores que 1.000. Exiba os resultados.
 */

public class Questao624 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite um inteiro: %n");
		int num = input.nextInt();
		
		isPerfect(num);

	}
	public static void isPerfect(int num) {
		double sum = 0;
		double mid = 0;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				mid = Math.floor(num / 2 + 0.5);
				sum += mid;
				double a = mid /2;
				if (sum == num)
					break;
				System.out.printf("A contagem est� em %d. O meio � %f%n e a soma d� %.2f.%n",i,mid, sum);
				
				j+=a;
				
			}
			i+=mid;
		}
			
		
	}

}
