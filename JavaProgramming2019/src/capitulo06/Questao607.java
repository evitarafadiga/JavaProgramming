package capitulo06;

public class Questao607 {

	public static void main(String[] args) {
		
		double x = 0.0;
		
		x = Math.abs(7.5);
		System.out.printf("O valor de x: %f%n",x);
		x = Math.floor(7.5);
		System.out.printf("O valor de x: %f%n",x);
		x = Math.abs(0.0);
		System.out.printf("O valor de x: %f%n",x);
		x = Math.ceil(0.0);
		System.out.printf("O valor de x: %f%n",x);
		x = Math.abs(-6.4);
		System.out.printf("O valor de x: %f%n",x);
		x = Math.ceil(-6.4);
		System.out.printf("O valor de x: %f%n",x);
		x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
		System.out.printf("O valor de x: %f%n",x);

	}

}
