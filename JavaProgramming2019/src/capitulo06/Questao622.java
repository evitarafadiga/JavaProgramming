package capitulo06;

import java.util.Scanner;

/*
 * Implemente os seguintes métodos inteiros:
 * a) O método celsius retorna o equivalente em Celsius de uma temperatura em Fahrenheit utilizando o cálculo
 * 
 * celsius = 5.0 / 9.0 * (fahrenheit - 32);
 * 
 * b) O método fahrenheit retorna o equivalente em Fahrenheit de uma temperatura em Celsius utilizando o cálculo
 * 
 * fahrenheit = 9.0 / 5.0 * celsius + 32;
 * 
 * c) Utilize os métodos nas partes (a) e (b) para escrever um aplicativo que permite ao usuário inserir uma 
 * temperatura em Fahrenheit e exibir o equivalente em Celsius ou inserir uma temperatura em Celsius e exibir 
 * o equivalente em Fahrenheit.
 */
public class Questao622 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Insira o valor da temperatura: %n");
		double temp = input.nextDouble();
		System.out.printf("Insira a escala de temperatura C para Celsius ou F para Fahrenheit: %n");
		String op = input.next();
		
		switch (op) {
		case ("c"):
			fahrenheit(temp);
		break;
		case ("f"):
		celsius(temp);
		break;
		}
		
	}
	
	public static void fahrenheit (double temp) {
		double f = 9.0 / 5.0 * temp + 32;
		System.out.printf("A temperatura de %fºC convertida em Fahrenheit equivale a: %f%n",temp,f);
	}
	
	public static void celsius (double temp) {
		double c =  5.0 / 9.0 * (temp - 32);
		System.out.printf("A temperatura de %fºF convertida em Celsius equivale a: %f%n",temp,c);
	}

}
