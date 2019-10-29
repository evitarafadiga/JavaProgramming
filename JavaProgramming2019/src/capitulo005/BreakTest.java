package capitulo005;

public class BreakTest {

	public static void main(String[] args) {
		
		int count;
		
		for (count = 1; count <= 10; count++) {
			
			if (count == 5)
				break;
			
			System.out.printf("%d ", count);	
		}
		
		System.out.printf("%nQuebrou o loop na contagem = %d%n", count);
	}

}
