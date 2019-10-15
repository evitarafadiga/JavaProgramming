package capitulo004;

public class StudentTest {

	public static void main(String[] args) {
		Student account1 = new Student("Jane Green", 93.5);
		Student account2 = new Student ("John Blue", 72.75);
		
		System.out.printf("O boletim de %s é: %s%n", account1.getName(),account1.getLetterGrade());
		System.out.printf("O boletim de %s é: %s%n", account2.getName(),account2.getLetterGrade());
		
	}

}
