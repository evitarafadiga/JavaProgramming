package capitulo08;

public class RationalTest {

	public static void main(String[] args) {

		Rational rati = new Rational(8,5);
		Rational ratii = new Rational(12,7);
		
		Rational.armazena(rati,ratii);
		Rational.rationalSum(rati,ratii);
		Rational.rationalSub(rati,ratii);
		Rational.rationalDiv(rati,ratii);
		Rational.rationalMult(rati, ratii);
	}

}
