package capitulo007;

import java.util.Scanner;

public class Exercicio719 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite 1 para primeira classe ou 2 para classe economica: %n");
		boolean [] seats = new boolean [10];
		int op = input.nextInt();
		
		switch (op) {
			case 1:
				System.out.println("Primeira classe selecionada.");
				for (int i = 0; i < 5; i++) {
					seats [i] = true;
				}
				printArray(seats);
				break;
			case 2:
				System.out.println("Classe econômica selecionada.");
				for (int i = 5; i < seats.length; i++) {
					seats [i] = true;
				}
				printArray(seats);
				break;
			default:
				
				System.out.printf("%nO próximo vôo parte em 3 horas.");
			break;
		}
		
	}
	
	public static void printArray(boolean [] seats) {
		
		for (int i = 0; i < seats.length; i++) {		
			if (seats[i] == false)
			System.out.printf("Assento nº%3d livre %n",i+1);
			else
				System.out.printf("Assento nº%3d reservado %n",i+1);
		}
	}

}
