package exercicios;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.print("Insira o primeiro número inteiro: ");
		num1 = input.nextInt();
		
		System.out.print("Insira o segundo número inteiro: ");
		num2 = input.nextInt();
		
		if (num1 == num2)
			System.out.printf("%d == %d%n",num1,num2);
		if (num1 != num2)
			System.out.printf("%d != %d%n",num1, num2);
		if (num1 < num2)
			System.out.printf("%d < %d%n",num1,num2);
		if (num1 > num2)
			System.out.printf("%d > %d%n",num1,num2);
		if (num1 <= num2)
			System.out.printf("%d <= %d%n",num1,num2);
		if (num1 >= num2)
			System.out.printf("%d >= %d%n",num1,num2);
		
				
	}

}
