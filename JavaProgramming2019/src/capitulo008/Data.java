package capitulo008;

import java.util.Iterator;

public class Data {
	private int month; // 1-12
	private int day; // 1-31 conforme o mês
	private int year; // qualquer ano
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

public Data(int day, int month, int year) {
		
		// verifica se day está no intervalo para month
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		// verifica se mês está no intervalo
				if (month <= 0 || month > 12)
					throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		// verifique no ano bissexto se o mês é 2 e o dia é 29
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		this.month = month;
		this.day = day;
		this.year = year;
		//System.out.printf("Date object constructor for date %s%n", this);
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

	// retorna uma String no formato mês/dia/ano
	public String mode1() {
		return String.format("%2d/%2d/%4d", month, day, year);
	}
	
	public String mode2() {
		String temp = null;
		switch (month) {
			case 1:
				temp = "January";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 2:
				temp = "February";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 3:
				temp = "March";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 4:
				temp = "April";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 5:
				temp = "May";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 6:
				temp = "June";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 7:
				temp = "July";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 8:
				temp = "August";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 9:
				temp = "September";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 10:
				temp = "October";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 11:
				temp = "November";
				return String.format("%10s%3d,%5d", temp, day, year);
			case 12:
				temp = "December";
				return String.format("%10s%3d,%5d", temp, day, year);
			default:
				break;	
		}
		return null;
	}
	
	public String mode3() {
		int temp = 0;
		temp += day - daysPerMonth[month];
		for (int i = 1; i <= month; i++) {
			temp += daysPerMonth[i];	
		}
		
		
		return String.format("%3d %4d", temp, year);
	}

}
