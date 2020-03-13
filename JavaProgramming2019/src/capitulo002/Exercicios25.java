package capitulo002;

import java.util.Scanner;

public class Exercicios25 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x,y,z,result;
		
		System.out.println("Insira o primeiro inteiro: ");
		x = input.nextInt();
		
		System.out.println("Insira o segundo inteiro: ");
		y = input.nextInt();
		
		System.out.println("Insira o terceiro inteiro: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.println("O produto de "+x+" * "+y+" * "+z+" equivale a: "+result);
		
	}
}
