package capitulo08;

import java.math.*;

public class SavingsAccount {
	
	private static BigDecimal annualInterestRate = BigDecimal.valueOf(0.04);
	private BigDecimal SavingsBalance;
	
	public SavingsAccount(BigDecimal SavingsBalance) {
		this.SavingsBalance = SavingsBalance;
	}
	
	public BigDecimal calculateMonthlyInterest() {
		BigDecimal months = BigDecimal.valueOf(1.00);
		BigDecimal temp;
		BigDecimal interest;
		temp = annualInterestRate.divide(months, RoundingMode.HALF_UP);
		interest = SavingsBalance.multiply(temp);
		return SavingsBalance.add(interest);
		
		
				
	}
	
	public static BigDecimal modifyInterestRate(BigDecimal newValue) {
		return annualInterestRate = newValue;
		
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
	
}
