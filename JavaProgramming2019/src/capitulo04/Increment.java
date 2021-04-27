package capitulo04;

public class Increment {

	public static void main(String[] args) {
		int c = 5;
		System.out.printf("c antes da pós-incrementação: %d%n",c);
		System.out.printf(" pós-incrementando c: %d%n", c++);
		System.out.printf("c depois da pós-incrementação: %d%n",c);
		
		System.out.println();
		
		c = 5;
		System.out.printf("c antes da pré-incrementação: %d%n",c);
		System.out.printf(" pré-incrementando c: %d%n", ++c);
		System.out.printf("c depois da pré-incrementação: %d%n",c);
	}

}
