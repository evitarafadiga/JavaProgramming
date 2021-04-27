package capitulo08;

public class DateAndTimeTest {

	public static void main(String[] args) {

		DateAndTime Time1 = new DateAndTime (0,0,0,1,1,1);
		DateAndTime Time2 = new DateAndTime (11,30,0,26,05,1998);
		DateAndTime Time3 = new DateAndTime (18,57,0,21,12,2020);
		DateAndTime Time4 = new DateAndTime (23,59,59,1,12,2000);
		DateAndTime Time5 = new DateAndTime (23,59,59,31,12,2020);
		displayTime("Data 1:", Time1);
		Time1.Tick();
		displayTime("Data 1 depois do primeiro Tick:", Time1);
		displayTime("Data 2:", Time2);
		Time2.Tick();
		displayTime("Data 2 depois do primeiro Tick:", Time2);
		displayTime("Data 3:", Time3);
		Time3.Tick();
		displayTime("Data 3 depois do primeiro Tick:", Time3);
		displayTime("Data 4:", Time4);
		Time4.Tick();
		displayTime("Data 4 depois do primeiro Tick:", Time4);
		displayTime("Data 5:", Time5);
		Time5.Tick();
		displayTime("Data 5 depois do primeiro Tick:", Time5);
	}
	
	private static void displayTime(String header, DateAndTime t) {
		System.out.printf("%s%n%s%n", header, t.toUniversalString());
	}

}
