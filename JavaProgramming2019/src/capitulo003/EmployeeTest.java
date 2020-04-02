package capitulo003;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee("João","E. O. Pé de Feijão", 1456.81);
		Employee employee2 = new Employee("Boto","Cor-de-Rosa", 999.50);
		
		
		System.out.printf("%n O salário do Sr.(a): %s %s equivale a %s após aplicação do bônus",employee1.getNome(),employee1.getSobrenome(),employee1.getSalario());
		System.out.printf("%n O salário do Sr.(a): %s %s equivale a %s após aplicação do bônus",employee2.getNome(),employee2.getSobrenome(),employee2.getSalario());
		
	}

}
