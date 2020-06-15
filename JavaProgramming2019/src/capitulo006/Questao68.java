package capitulo006;

import java.util.Scanner;

/* (Taxas de estacionamento) Um estacionamento cobra uma tarifa m�nima de R$ 2,00 para estacionar por at� tr�s horas. Um adicional
de R$ 0,50 por hora n�o necessariamente inteira � cobrado ap�s as tr�s primeiras horas. A tarifa m�xima para qualquer dado per�odo
de 24 horas � R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva um aplicativo que calcule e
exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem. Voc� deve inserir as horas de estacionamento
para cada cliente. O programa deve exibir a cobran�a para o cliente atual e calcular e exibir o total dos recibos de ontem. Ele deve utilizar
o m�todo calculateCharges para determinar a tarifa para cada cliente.

*/

public class Questao68 {

	public static void main(String[] args) {
		
		double cost = 0;
		int qtdcliente = 0;
		
		Scanner input = new Scanner(System.in);
		
			String name = null;
			double hora = 0.0;
			
			System.out.println("Insira o nome do cliente ou digite -1 para finalizar: ");
			name = input.nextLine();
			
			System.out.printf("Insira a quantidade de horas do cliente %s: ",name);
			hora = input.nextDouble();
			
			calculateCharges(name,hora);

	}

	public static void calculateCharges(String name, double hora) {
		double cost = 0.0;
		
		if (hora <= 3) {
			cost = 2;
		}
		else {
			for (int i = 0; i < hora; i++) {
				cost = 2;
				cost+=0.5;
			}
			
		}
		if (hora >= 24) {
			cost = 10;
		}
		
		System.out.printf("O custo do estacionamento de %s fica em: %2.0f%n",name,cost);


	}

}
