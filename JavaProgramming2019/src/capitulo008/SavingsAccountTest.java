package capitulo008;

import java.math.BigDecimal;
import java.text.Format;
import java.text.NumberFormat;

public class SavingsAccountTest {

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount(BigDecimal.valueOf(2000.00));
		SavingsAccount saver2 = new SavingsAccount(BigDecimal.valueOf(3000.00));
		
		BigDecimal newValue = BigDecimal.valueOf(0.05);
		
		System.out.printf("%5s%21s%20s%n","MES","Poupanceiro 1", "Poupanceiro 2");
		for (int i = 1; i < 13; i++) {
			
			BigDecimal amount = saver1.getSavingsBalance()
					.multiply(saver1.getAnnualInterestRate().add(BigDecimal.ONE).pow(i));

			BigDecimal amount2 = saver2.getSavingsBalance()
					.multiply(saver2.getAnnualInterestRate().add(BigDecimal.ONE).pow(i));

			System.out.printf("%4d%20s%20s%n", i,NumberFormat.getCurrencyInstance().format(amount),NumberFormat.getCurrencyInstance().format(amount2));

			
		}
		
		
		for (int j = 13; j < 14; j++) {
			
			System.out.println();
			System.out.printf("%5s%21s%20s%n","MES","Poupanceiro 1", "Poupanceiro 2");
			BigDecimal amount1 = saver1.getSavingsBalance()
					.multiply(saver1.modifyInterestRate(newValue).add(BigDecimal.ONE).pow(j));

			BigDecimal amount21 = saver2.getSavingsBalance()
					.multiply(saver2.modifyInterestRate(newValue).add(BigDecimal.ONE).pow(j));
			
			System.out.printf("%4d%20s%20s%n", j,NumberFormat.getCurrencyInstance().format(amount1),NumberFormat.getCurrencyInstance().format(amount21));

			
		}

	}

}
