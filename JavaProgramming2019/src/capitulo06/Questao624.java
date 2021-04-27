package capitulo06;

import java.util.Scanner;
/*
 * Dizemos que um número inteiro é um número perfeito se a soma de seus fatores, incluindo 1 (mas não o próprio
 * número), for igual ao número. Por exemplo, 6 é um número perfeito porque 6 = 1 + 2 + 3. Escreva um método 
 * isPerfect que determina se parâmetro number é um número perfeito. Utilize esse método em um applet que 
 * determina e exibe todos os números perfeitos entre 1 e 1.000. 
 * 
 * Exiba os fatores de cada número perfeito confirmando que ele é de fato perfeito. Desafie o poder de computação 
 * do seu computador testando números bem maiores que 1.000. Exiba os resultados.
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
				System.out.printf("A contagem está em %d. O meio é %f%n e a soma dá %.2f.%n",i,mid, sum);
				
				j+=a;
				
			}
			i+=mid;
		}
			
		
	}

}
