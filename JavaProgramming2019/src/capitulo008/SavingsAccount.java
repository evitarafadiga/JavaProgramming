package capitulo008;

import java.math.*;

public class SavingsAccount {
	
	private static BigDecimal annualInterestRate = BigDecimal.valueOf(0.04);
	private BigDecimal SavingsBalance;
	
	public SavingsAccount(BigDecimal SavingsBalance) {
		this.SavingsBalance = BigDecimal.valueOf(200.80);
	}
	
	public String calculateMonthlyInterest(BigDecimal SavingsBalance, BigDecimal annualInterestRate) {
		BigDecimal months = BigDecimal.valueOf(12.0);
		SavingsBalance = SavingsBalance.multiply(annualInterestRate);
		SavingsBalance = SavingsBalance.divide(months);
		String result = SavingsBalance.toPlainString();
		return result;
	}
	
	public static void modifyInterestRate(BigDecimal annualInterestRate) {
		annualInterestRate = BigDecimal.valueOf(200.99);
		
	}

	public static BigDecimal getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(BigDecimal annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public BigDecimal getSavingsBalance() {
		return SavingsBalance;
	}

	public void setSavingsBalance(BigDecimal savingsBalance) {
		SavingsBalance = savingsBalance;
	}
	
	public String toString() {
		return String.format("O balanço atual equivale a: %f%n"
				+ "A porcentagem de juros equivale a: %f%n"
				+ "O calculo de juros por mes equivale a: %f%n"
				, getSavingsBalance(),getAnnualInterestRate(), calculateMonthlyInterest(SavingsBalance, annualInterestRate));
	}
}
