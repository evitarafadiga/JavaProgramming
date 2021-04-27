package capitulo06;

public class MethodOverload {

	public static void main(String[] args) {

		System.out.printf("O quadrado do inteiro de 7 equivale a: %d%n",square(7));
		
		System.out.printf("O quadrado do duplo de 7.5 equivale a: %f%n",square(7.5));
		
	}
	
	public static int square(int intValue){
		
		System.out.printf("Chamado square com argumento : %d%n", intValue);
		
		return intValue * intValue;
		
	}
	
	public static double square(double doubleValue){
		
		System.out.printf("Chamado square com argumento : %f%n", doubleValue);
		
		return doubleValue * doubleValue;
		
	}

}
