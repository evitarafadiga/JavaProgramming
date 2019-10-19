package capitulo004;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		System.out.print("Insira a série ou -1 para sair: ");;
		int grade = input.nextInt();
		
		while (grade != -1) {
			total = total +grade;
			gradeCounter = gradeCounter + 1;
			
			System.out.print("\nInsira a série ou -1 para sair: ");
			grade = input.nextInt();
		}
		
		if (gradeCounter != 0) {
			
			double average = (double) total / gradeCounter;
			
			System.out.printf("%nO total de séries inseridas é: %d%n", gradeCounter, total);
			
		}
		else
			System.out.println ("Nenhuma série foi inserida.");
		
//		while (gradeCounter <= 10) {
//			
//			System.out.print("Insira a série: ");
//			int grade = input.nextInt();
//			total = total + grade;
//			gradeCounter = gradeCounter + 1;
//			
//		}
//		
		double average = total / 10;
		
		System.out.printf("%nTotal de todas as grades é %d%n",  total);
		System.out.printf("A média da classe é %d%n", average);
		
	}

}
