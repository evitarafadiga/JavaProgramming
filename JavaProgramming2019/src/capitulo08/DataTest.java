package capitulo08;

public class DataTest {

	public static void main(String[] args) {

		Data d1 = new Data(26,05,1998);
		displayDate("Data 1: ",d1);
		Data d2 = new Data(26,05,2020);
		displayDate("Data 2: ",d2);
		Data d3 = new Data(01,02,2021);
		displayDate("Data 3: ",d3);
		Data d4 = new Data (31,12,2021);
		displayDate("Data 4: ",d4);
	}
	
	private static void displayDate(String header, Data d){
		System.out.printf("%s%40s%n", header, d.mode1());
		System.out.printf("%s%40s%n", header, d.mode2());
		System.out.printf("%s%40s%n", header, d.mode3());
	}

}
