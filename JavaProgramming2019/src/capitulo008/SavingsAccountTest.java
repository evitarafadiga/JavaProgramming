package capitulo008;

import java.math.BigDecimal;

public class SavingsAccountTest {

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount(BigDecimal.valueOf(2000.00));
		SavingsAccount saver2 = new SavingsAccount(BigDecimal.valueOf(3000.00));
		
		displayInterest("Poupanceiro 1 :",saver1);
		displayInterest("Poupanceiro 2 :",saver2);
	}
	
	private static void displayInterest(String header, SavingsAccount sa) {
		System.out.printf("%s%n%s%n%n", header, sa.toString());
	}

}
