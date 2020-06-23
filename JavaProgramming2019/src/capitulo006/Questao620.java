package capitulo006;

import java.util.Scanner;
/*
 * Escreva um aplicativo que solicita ao usuário o raio de um círculo e utiliza um método chamado circleArea para
 * calcular a área do círculo.
 */

public class Questao620 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Insira o raio do círculo: %n");
		
		double r = input.nextDouble();
		
		circleArea(r);
	}

	public static void circleArea(double r) {
		double area = Math.PI * (Math.pow(r, 2));
		System.out.printf("A area %f do circulo equivale a: %f%n",r,area);
	}
}
