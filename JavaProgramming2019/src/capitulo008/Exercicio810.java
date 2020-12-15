package capitulo008;

public class Exercicio810 {

	public enum TrafficLight { RED, GREEN, YELLOW }
	
	public static void main(String[] args) {
		
		TrafficLight light = TrafficLight.GREEN;
		
		if (light == TrafficLight.GREEN)
			System.out.printf("%s%nDuracao: %d segundos.",TrafficLight.GREEN, 10);
		else if (light == TrafficLight.YELLOW)
			System.out.printf("%s%nDuracao: %d segundos.",TrafficLight.YELLOW, 8);
		else
			System.out.printf("%s%nDuracao: %d segundos.",TrafficLight.RED, 30);
			

	}
	

}
