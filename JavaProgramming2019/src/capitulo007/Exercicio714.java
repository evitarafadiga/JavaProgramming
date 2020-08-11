package capitulo007;

public class Exercicio714 {

	public static void main(String[] args) {
		
		double p1 = 3.0;
		double p2 = 9.0;
		double p3 = 5.4;
		double p4 = 8.5;
		double p5 = 4.0;
		
		System.out.printf("p1 = %.1f%np2 = %.1f%np3 = %.1f%np4 = %.1f%np5 = %.1f%n",p1,p2,p3,p4,p5);
		System.out.println();
		System.out.printf("Produto destes equivale a: %.1f%n",product(p1,p2,p3,p4,p5));
	}
	
	public static double product(double... numbers) {
		double total = 0.0;
		
		for (double p : numbers) {
			if (total != 0.0)
				total*=p;
			else
				total=p;
		}
		return total;
	}

}
