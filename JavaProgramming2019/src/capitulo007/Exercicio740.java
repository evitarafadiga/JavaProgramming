package capitulo007;

import java.util.Scanner;

public class Exercicio740 {

	public static void main(String[] args) {
		String[] topics = new String[5];
		int[][] responses = new int[5][10];

		topics[0] = "Importância de votar";
		topics[1] = "Vacina";
		topics[2] = "Lixo no lixo";
		topics[3] = "Serviços de streaming";
		topics[4] = "Pessoas virtuais em campanhas";

//		for (int i = 0; i < topics.length; i++) {
//			System.out.printf("Insira um grau de importancia de 0 a 10 para o tema: %s%n",topics[i]);
//			Scanner input = new Scanner(System.in);
//			int nota = input.nextInt();
//		}
		
		for (int k = 0; k < responses.length; k++) {
			
			for (int k2 = 0; k2 < responses.length; k2++) {
				System.out.printf("[%s]", topics[k]);
				//System.out.printf("[%s] ", responses[k][k2]);

				if (k % 5 == 0)
					System.out.println();
			}
		}

	}
	
	public static void outbarChart(int [] array) {
		int[] frequency = new int [10];
		
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 1:
				frequency[i] += 1;
			case 2:
				frequency[i] += 2;
			case 3:
				frequency[i] += 3;
			case 4:
				frequency[i] += 4;
			case 5:
				frequency[i] += 5;
			case 6:
				frequency[i] += 6;
			case 7:
				frequency[i] += 7;
			case 8:
				frequency[i] += 8;
			case 9:
				frequency[i] += 9;
			case 10:
				frequency[i] += 10;
			}
		}
	}

}
