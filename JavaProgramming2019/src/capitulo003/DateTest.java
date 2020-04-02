package capitulo003;

public class DateTest {

	public static void main(String[] args) {

		Date date1 = new Date(5,26,1998);
		
		System.out.printf("%n A data do meu nascimento equivale a: %s/%s/%s", date1.getDia(),date1.getMes(),date1.getAno());
		
	}

}
