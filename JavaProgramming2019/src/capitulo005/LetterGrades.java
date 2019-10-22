package capitulo005;

import java.util.Scanner;

public class LetterGrades {

	public static void main(String[] args) {
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n   %s%n   %s%n", 
				"Insira o inteiro das grades de 0 a 100.", 
				"Digite o fim do arquivo indicador para terminar o envio:", 
				"No UNIX/Linux/Mac OS X tecle <Ctrl> d e depois aperte Enter", 
				"No Windows tecle <Ctrl> z e depois Enter");
		
		while (input.hasNext()) {
			int grade = input.nextInt(); //lê a nota
			total += grade; //adiciona nota a total
			++gradeCounter; //incrementa o número de notas
			
			// incrementa o contador de letras de nota adequado
			switch (grade / 10) {
			case 9: // a nota estava entre 90
			case 10: // e 100, inclusivo
				++aCount;
				break;
			case 8:
				++bCount;
				break;
			case 7:
				++cCount;
				break;
			case 6:
				++dCount;
				break;
			default:
				++fCount;
				break;
			} //fim do switch
		}
		
		System.out.printf("%nGrade Report:%n");
		
		if (gradeCounter != 0) {
			
			double average = (double) total / gradeCounter;
			
			System.out.printf("Total de %d das grades inseridas é %d%n", gradeCounter, total);
			System.out.printf("Média da classe é %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n","Número de estudantes que receberam cada grade:",
					"A: ", aCount,
					"B: ", bCount,
					"C: ", cCount,
					"D: ", dCount,
					"F: ", fCount);
		}
		else
			System.out.println("Nenhuma grade foi inserida.");
	}

}
