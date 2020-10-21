package capitulo008;

public class Time1Test {

	public static void main(String[] args) {
		Time1 time = new Time1();
		
		displayTime("Depois que o objeto time é criado", time);
		System.out.println();
		
		time.setTime(13, 27, 6);
		displayTime("Depois de chamar setTime", time);
		System.out.println();
		
		try {
			time.setTime(99, 99, 99);
		} catch (IllegalArgumentException e) {
			System.out.printf("Excecao: %s%n%n", e.getMessage());
		}
		displayTime("Depois de chamar setTime com valores inválidos: ", time);
		
	}
	
	private static void displayTime(String header, Time1 t) {
		System.out.printf("%s%nHora universal: %s%nHora estandarte: %s%n",
				header, t.toUniversalString() , t.toString() );
		
	}

}
