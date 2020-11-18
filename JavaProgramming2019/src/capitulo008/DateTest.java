package capitulo008;

public class DateTest {

	public static void main(String[] args) {

		Date d1 = new Date(1,0,0);
		displayDate("Primeira data:",d1);
	}
	
	private static void displayDate(String header, Date d){
		System.out.printf(d.toString());
	}

}
