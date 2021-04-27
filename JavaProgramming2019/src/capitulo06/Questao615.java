package capitulo06;

import java.util.Scanner;
/*
 *  Defina um m�todo hypotenuse que calcula a hipotenusa de um tri�ngulo ret�ngulo quando s�o dados os comprimentos 
 *  dos outros dois lados. O m�todo deve tomar dois argumentos do tipo double e retornar a hipotenusa como um double.
 *  Incorpore esse m�todo a um aplicativo que l� valores para side1 e side2 e realiza o c�lculo com o m�todo hypotenuse. 
 *  Utilize os m�todos Math pow e sqrt para determinar o tamanho da hipotenusa de cada um dos tri�ngulos na Figura 6.15. 
 *  [Observa��o: a classe Math tamb�m fornece o m�todo hypot para realizar esse c�lculo.]
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
