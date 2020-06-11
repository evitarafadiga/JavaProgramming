package capitulo006;
/*
 * 
 * Escreva um aplicativo que teste se os exemplos de chamadas de método da classe Math mostrada na Figura 6.2 
 * realmente produzem os resultados indicados.
	
   Forneça o cabeçalho de método para cada um dos seguintes métodos.
   
	a) O método hypotenuse, que aceita dois argumentos de ponto flutuante de precisão dupla side1 e side2 e
	 retorna um resultado de ponto flutuante de dupla precisão.
	
	b) O método smallest, que recebe três inteiros x, y e z e retorna um inteiro.
	
	c) O método instructions, que não aceita nenhum argumento e não retorna um valor. 
	[Observação: esses métodos são comumente utilizados para exibição de instruções para o usuário.]
	
	d) O método intToFloat , que recebe um argumento number do tipo inteiro e retorna um float.

 */

public class Exercicio63 {

	public static void main(String[] args) {
		
		System.out.println("Exercicio 6.3 \n");
		
		System.out.println(Math.abs(25.7));
		System.out.println(Math.ceil(25.7));
		System.out.println(Math.cos(0.0));
		System.out.println(Math.exp(25.7));
		System.out.println(Math.floor(25.7));
		System.out.println(Math.log(25.7));
		System.out.println(Math.max(25.7, 30.2));
		System.out.println(Math.min(25.7, 30.2));
		System.out.println(Math.pow(25.7, 30.2));
		System.out.println(Math.sin(25.7));
		System.out.println(Math.sqrt(25.7));
		System.out.println(Math.tan(25.7));
		
		System.out.println("Exercicio 6.3 a) \n");
		
		Hypotenuse(5, 3);
		
		System.out.println("Exercicio 6.3 b) \n");
		
		Smallest(2, 57, 8);
		
		System.out.println("Exercicio 6.3 c) \n");
		
		Instructions();
		
		System.out.println("Exercicio 6.3 d) \n");
		
		IntToFloat(5);
	}
	
	public static void Hypotenuse(double side1, double side2) {
		
		double res = 0;
		res += Math.pow(side1, 2);
		res += Math.pow(side2, 2);
		res = Math.sqrt(res);
		
		System.out.printf("A hipotenusa de %.0f + %.0f equivale a %.1f%n",side1,side2,res);
	}
	
	public static void Smallest(int a, int b, int c) {
		int min = 0;
		min = Math.min(a, b);
		min = Math.min(b, c);
		min = Math.min(c, a);
		
		System.out.printf("O numero minimo equivale a: %d%n",min);
	}
	
	public static void Instructions() {
		System.out.println("Instrucao recebida.");
	}
	
	public static float IntToFloat(float inteiro) {
		
		System.out.print(inteiro);
		return inteiro;
		
	}

}
