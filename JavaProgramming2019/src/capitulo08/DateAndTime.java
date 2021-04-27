package capitulo08;

public class DateAndTime {

	private int month; // 1-12
	private int day; // 1-31 conforme o mês
	private int year; // qualquer ano
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	public DateAndTime()
	{
		this( 0, 0, 0, 0, 0, 0);
	}
	
	public DateAndTime(int hour, int minute, int second, int day, int month, int year) {

		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		if (second < 0)
			throw new IllegalArgumentException("second must be bigger than 0");

		this.hour = hour;
		this.minute = minute;
		this.second = second;

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

	// Construtor Time2: outro objeto Time2 fornecido
	public DateAndTime(DateAndTime time) {

		this(time.getHour(), time.getMinute(), time.getSecond(), time.getDay(), time.getMonth(), time.getYear());
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void Tick() {
		if (second < 59) {
			this.second += 1;
		} else {
			this.second = 0;
			incrementMinute();
		}

	}

	public void incrementMinute() {
		if (minute < 59) {
			this.minute += 1;
		} else {
			this.minute = 0;
			incrementHour();
		}

	}

	public void incrementHour() {
		if (hour < 23) {
			this.hour += 1;
		} else {
			this.hour = 0;
			nextDay();
		}

	}

	// Configura um novo valor de tempo usando hora universal;
	// valida os dados
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		if (second < 0)
			throw new IllegalArgumentException("second must be bigger than 0");
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// valida e configura a hora
	public void setHour(int hour) {
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		this.hour = hour;
	}

	// valida e configura os minutos
	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		this.minute = minute;
	}

	// valida e configura os segundos
	public void setSecond(int second) {
		if (second < 0)
			throw new IllegalArgumentException("second must be 0-59");
		this.second = second;
	}

	// Mï¿½todos get
	// obtï¿½m valor da hora
	public int getHour() {
		return hour;
	}

	// obtï¿½m valor dos minutos
	public int getMinute() {
		return minute;
	}

	// obtï¿½m valor dos segundos
	public int getSecond() {

		if (second > 59) {
			int horas = second / 3600;
			int minutos = (second - (horas * 3600)) / 60;
			int segundos = second - (horas * 3600) - (minutos * 60);

			this.hour = horas;
			this.minute = minutos;
			this.second = segundos;

		}
		return second;
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d%n%2d/%2d/%4d", getHour(), getMinute(), getSecond(), getDay(), getMonth(),
				getYear());
	}

}
