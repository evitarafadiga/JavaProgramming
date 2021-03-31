package capitulo008;

public class Rational {

	private int numerator = 0;
	private int denominator = 0;

	public Rational(int i, int j) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Rational() {
		this(1, 2);
	}

	public void armazena(int... args) {
		int x, y, z, a = 0;

		x = args[0];
		y = args[1];
		z = args[2];
		a = args[3];

		if (isMiddle(x, y) == true) {
			x = 1;
			y = 2;
		}
		if (isMiddle(z, a) == true) {
			z = 1;
			a = 2;
		}
		
	}

	public static boolean isMiddle(int x, int y) {
		if (Math.floor(y / 2) == x)
			return true;
		else
			return false;
	}

	public static void rationalSum(Rational rati, Rational ratii) {
		int c = rati.numerator + ratii.numerator;
		int b = rati.denominator + ratii.denominator;
		
		if (isMiddle(c , b) == true) {
			c = 1;
			b = 2;
		}
		
		System.out.printf("A soma equivale a: %n %d/%d + %d/%d = %d/%d",rati.numerator,rati.denominator,ratii.numerator,ratii.denominator,c,b);
	}
	
	public static void rationalMult(Rational rati, Rational ratii) {
		int c = rati.numerator * ratii.numerator;
		int b = rati.denominator * ratii.denominator;
		
		if (isMiddle(c, b) == true) {
			c = 1;
			b = 2;
		}
		
		System.out.printf("%nA multiplicacao equivale a: %n %d/%d + %d/%d = %d/%d",rati.numerator,rati.denominator,ratii.numerator,ratii.denominator,c,b);
	}
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public static void rationalSub(Rational rati, Rational ratii) {
		int c = rati.numerator - ratii.numerator;
		int b = rati.denominator - ratii.denominator;
		
		if (isMiddle(c, b) == true) {
			c = 1;
			b = 2;
		}
		
		System.out.printf("%nA subtracao equivale a: %n %d/%d + %d/%d = %d/%d",rati.numerator,rati.denominator,ratii.numerator,ratii.denominator,c,b);
	}
	
	public static void rationalDiv(Rational rati, Rational ratii) {
		int c = rati.numerator / ratii.numerator;
		int b = rati.denominator / ratii.denominator;
		
		if (isMiddle(c, b) == true) {
			c = 1;
			b = 2;
		}
		
		System.out.printf("%nA divisao equivale a: %n %d/%d + %d/%d = %d/%d",rati.numerator,rati.denominator,ratii.numerator,ratii.denominator,c,b);
	}

	public static void armazena(Rational rati, Rational ratii) {

		int x, y, z, a = 0;

		
		x = rati.numerator;
		y = rati.denominator;
		z = ratii.numerator;
		a = ratii.denominator;
		if (isMiddle(x, y) == true) {
			x = 1;
			y = 2;
		}
		if (isMiddle(z, a) == true) {
			z = 1;
			a = 2;
		}		
	}

}
