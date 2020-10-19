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

		for (int i = 0; i < topics.length; i++) {
			System.out.printf("Insira um grau de importancia de 0 a 10 para o tema: %s%n", topics[i]);
			Scanner input = new Scanner(System.in);
			int nota = input.nextInt();

			switch (nota) {
			case 1:
				responses[i][0] = nota;
				break;
			case 2:
				responses[i][1] = nota;
				break;
			case 3:
				responses[i][2] = nota;
				break;
			case 4:
				responses[i][3] = nota;
				break;
			case 5:
				responses[i][4] = nota;
				break;
			case 6:
				responses[i][5] = nota;
				break;
			case 7:
				responses[i][6] = nota;
				break;
			case 8:
				responses[i][7] = nota;
				break;
			case 9:
				responses[i][8] = nota;
				break;
			case 10:
				responses[i][9] = nota;
				break;
			default:
				break;
			}

		}

		for (int k = 0; k < 5; k++) {

			for (int k2 = 0; k2 < 10; k2++) {

				if (k2 == 0) {
					System.out.printf("%n[%-30s]", topics[k]);
				}

				System.out.printf(" [ %-2s ] ", responses[k][k2]);
			}
		}
		outbarChart(responses);
	}

	public static void outbarChart(int[][] array) {
		int[] frequency = new int[10];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				switch (array[i][j]) {
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
		System.out.println();

	}

}
