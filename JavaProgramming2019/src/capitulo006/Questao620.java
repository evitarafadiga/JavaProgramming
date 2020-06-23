package capitulo006;

import java.util.Scanner;
/*
 * Escreva um aplicativo que solicita ao usu�rio o raio de um c�rculo e utiliza um m�todo chamado circleArea para
 * calcular a �rea do c�rculo.
 */

public class Questao620 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Insira o raio do c�rculo: %n");
		
		double r = input.nextDouble();
		
		circleArea(r);
	}

	public static void circleArea(double r) {
		double area = Math.PI * (Math.pow(r, 2));
		System.out.printf("A area %f do circulo equivale a: %f%n",r,area);
	}
}
