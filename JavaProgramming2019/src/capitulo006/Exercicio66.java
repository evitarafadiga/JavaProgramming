package capitulo006;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

/*
 * 
 * Declare o método sphereVolume para calcular e retornar o volume da esfera. Utilize a seguinte instrução para 
 * calcular o volume: double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
 * 
   Escreva um aplicativo Java que solicita ao usuário o raio do tipo double de uma esfera, chama sphereVolume
   para calcular o volume e exibe o resultado.

 */

public class Exercicio66 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o raio da esfera: ");
		double radius = input.nextDouble();
		
		System.out.printf("O volume equivale a: %f%n",SphereVolume(radius));

	}
	
	public static double SphereVolume(double radius) {

		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		
		return volume;
	}

}
