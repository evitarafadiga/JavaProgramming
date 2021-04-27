package capitulo06;

import java.util.Scanner;
/*
 *  Defina um método hypotenuse que calcula a hipotenusa de um triângulo retângulo quando são dados os comprimentos 
 *  dos outros dois lados. O método deve tomar dois argumentos do tipo double e retornar a hipotenusa como um double.
 *  Incorpore esse método a um aplicativo que lê valores para side1 e side2 e realiza o cálculo com o método hypotenuse. 
 *  Utilize os métodos Math pow e sqrt para determinar o tamanho da hipotenusa de cada um dos triângulos na Figura 6.15. 
 *  [Observação: a classe Math também fornece o método hypot para realizar esse cálculo.]
 */

public class Questao615 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Insira o primeiro lado: %n");
		double side1 = input.nextDouble();
		
		System.out.printf("Insira o segundo lado: %n");
		double side2 = input.nextDouble();
		
		hypotenuse(side1,side2);
	}

	public static void hypotenuse (double side1, double side2) {
		
		double h = Math.pow(side1, 2) + Math.pow(side2, 2);
		h = Math.sqrt(h);
		System.out.printf("A hipotenusa equivale a: %2.0f%n",h);
	}
}
