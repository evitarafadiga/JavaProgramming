package capitulo08;

public class Time2Test {
	public static void main(String[] args) {
		Time2 t1 = new Time2(); // 00:00:00
		Time2 t2 = new Time2(2); // 02:00:00
		Time2 t3 = new Time2(21, 34); // 21:34:00
		Time2 t4 = new Time2(12, 25, 42); // 12:25:42
		Time2 t5 = new Time2(t4); // 12:25:42
		Time2 t6 = new Time2(0, 0, 345);
		Time2 t7 = new Time2(0, 0, 8809);
		Time2 t8 = new Time2(0, 0, 55555);
		Time2 t9 = new Time2(0, 0, 99999);
		Time2 t10 = new Time2(23, 59, 59);
		Time2 t11 = new Time2(0, 0, 57);
		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified; default minute and second", t2);
		displayTime("t3: hour and minute specified; default second", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);
		displayTime("Teste1: ", t6);
		displayTime("Teste2: ", t7);
		displayTime("Teste3: ", t8);
		displayTime("Teste4: ", t9);
		displayTime("Teste10:", t10);
		t10.Tick();
		displayTime("Teste10 depois do primeiro Tick:", t10);
		t10.Tick();
		displayTime("Teste10 depois do segundo Tick:", t10);
		displayTime("Teste11:", t11);
		t11.Tick();
		displayTime("Teste11 depois do Tick:", t11);
		t11.Tick();
		displayTime("Teste11 depois do primeiro Tick:", t11);
		t11.Tick();
		displayTime("Teste11 depois do segundo Tick:", t11);
		t11.Tick();
		displayTime("Teste11 depois do terceiro Tick:", t11);
		try {
			Time2 t12 = new Time2(0, 0, 100); // valores inv�lidos

		} catch (IllegalArgumentException e) {
			System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
		}
	}

	// exibe um objeto Time2 nos formatos de 24 horas e 12 horas
	private static void displayTime(String header, Time2 t) {
		System.out.printf("%s%n%s%n%s%n", header, t.toUniversalString(), t.toString());
	}
}