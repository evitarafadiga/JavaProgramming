package capitulo09;

public class Exercicio3 {

	public class BasePlusCommissionEmployee {
		private double baseSalary; // sal�rio-base por semana
		// construtor de seis argumentos
		private String firstName;
		private String lastName;
		private String socialSecurityNumber;
		private double grossSales;
		private Object commissionRate;

		public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
				double grossSales, double commissionRate, double baseSalary) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.socialSecurityNumber = socialSecurityNumber;
			this.grossSales = grossSales;
			this.commissionRate = commissionRate;
			
			// se baseSalary � inv�lido, lan�a uma exce��o
			if (baseSalary < 0.0)
				throw new IllegalArgumentException("Base salary must be >= 0.0");
			this.baseSalary = baseSalary;
		}

		// configura o sal�rio-base
		public void setBaseSalary(double baseSalary) {
			if (baseSalary < 0.0)
				throw new IllegalArgumentException("Base salary must be >= 0.0");
			this.baseSalary = baseSalary;
		}

		// retorna o sal�rio-base
		public double getBaseSalary() {
			return baseSalary;
		}

		// calcula os lucros
		public double earnings() {
			return getBaseSalary() + earnings();

		}

		// retorna a representa��o de String de BasePlusCommissionEmployee
		@Override
		public String toString() {
			return String.format("%s %s%n%s: %.2f", "base-salaried",

					super.toString(), "base salary", getBaseSalary());

		}
	} // fim da classe BasePlusCommissionEmployee

}
