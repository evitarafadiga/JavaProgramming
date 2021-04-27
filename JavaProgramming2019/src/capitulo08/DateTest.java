package capitulo08;

public class DateTest {

	public static void main(String[] args) {

		Date d1 = new Date(01,01,2000);
		Date d2 = new Date(26,05,1998);
		Date d3 = new Date(31,01,2000);
		Date d4 = new Date(29,02,1928);
		displayDate("Data 1 antes: ",d1);
		d1.nextDay();
		displayDate("Data 1 depois: ",d1);
		displayDate("Data 2 antes: ",d2);
		d2.nextDay();
		displayDate("Data 2 depois: ",d2);
		displayDate("Data 3 antes: ",d3);
		d3.nextDay();
		displayDate("Data 3 depois: ",d3);
		displayDate("Data 4 antes: ",d4);
		d4.nextDay();
		displayDate("Data 4 depois: ",d4);
		
	}
	
	private static void displayDate(String header, Date d){
		System.out.printf("%20s%20s%n", header, d.toString());
	}

}
