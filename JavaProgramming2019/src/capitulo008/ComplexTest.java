package capitulo008;

public class ComplexTest {

	public static void main(String[] args) {

		Complex c1 = new Complex (12.066f,14.006f);
		Complex c2 = new Complex (6.333f,2.004f);
		
		displayEquation("Equacao 1: ", c1);
		displayEquation("Equacao 2: ", c2);
		
		sumReal(-1, c1, c2);

	}


	private static void sumReal(double i, Complex... c) {

		double realParts = 0;
		
		for (Complex complexes : c) {
			realParts += c.length;
		}
	}


	private static void displayEquation(String header, Complex c) {
		System.out.printf("%s%n%s%n", header, c.toString());
	}

}
