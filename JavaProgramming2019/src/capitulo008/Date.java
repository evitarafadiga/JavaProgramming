package capitulo008;

public class Date {
	private int month; // 1-12
	private int day; // 1-31 conforme o m�s
	private int year; // qualquer ano
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

// construtor: confirma o valor adequado para o m�s e dia dado o ano
	public Date(int day, int month, int year) {
		
		// verifica se day est� no intervalo para month
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		// verifica se m�s est� no intervalo
				if (month <= 0 || month > 12)
					throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		// verifique no ano bissexto se o m�s � 2 e o dia � 29
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		this.month = month;
		this.day = day;
		this.year = year;
		System.out.printf("Date object constructor for date %s%n", this);
	}

	public void nextDay() {
		if (day < daysPerMonth[month] && !(month == 2 && day == 29)) {
			this.day += 1;
		} else {
			this.day = 1;
			addMonth();

		}
	}

	public void addMonth() {
		if (month < 12) {
			this.month += 1;
		} else {
			this.month = 1;
			addYear();
		}
	}

	public void addYear() {
		this.year += 1;
	}

	// retorna uma String no formato m�s/dia/ano
	public String toString() {
		return String.format("%2d/%2d/%4d", day, month, year);
	}
}