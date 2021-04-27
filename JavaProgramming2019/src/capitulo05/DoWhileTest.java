package capitulo05;

public class DoWhileTest {

	public static void main(String[] args) {
		int counter = 1;
		
		do {
			System.out.printf("%d ", counter);
			++counter;
		}
		while (counter <= 10); //fim da instrução do...while 
		System.out.println();
	}
}
