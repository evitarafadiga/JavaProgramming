package capitulo004;

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		while (studentCounter <= 10) {
			
			System.out.print("Insira o resultado (1 = passa, 2 = falha);: ");
			int result = input.nextInt();
			
			if (result ==1)
				passes = passes + 1;
			else
				failures = failures + 1;
			
			studentCounter = studentCounter + 1;
			
		}
		
		System.out.printf("Passados: %d%n Falhados: %d%n", passes, failures);
		
		if (passes > 8)
			System.out.println("Bônus ao instrutor!");
		
	}

}
