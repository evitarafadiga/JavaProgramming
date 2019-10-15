package capitulo004;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		while (gradeCounter <= 10) {
			
			System.out.print("Insira a série: ");
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
		}
		
		int average = total / 10;
		
		System.out.printf("%nTotal de todas as 10 grades é %d%n",  total);
		System.out.printf("A média da classe é %d%n", average);
		
	}

}
