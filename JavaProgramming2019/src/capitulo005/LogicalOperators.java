package capitulo005;

public class LogicalOperators {

	public static void main(String[] args) {
		//cria tabela-verdade para o operador && (E condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n" , "Condicional E (&&)", "Falso && Falso", (false && false),
				"Falso && Verdadeiro", (false && true), "Verdadeiro && Falso",(true && false), "Verdadeiro && Verdadeiro",(true && true));
		
		//tabela-verdade para o operador || (OU condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n" , "Condicional OU (||)", "Falso && Falso", (false || false),
				"Falso && Verdadeiro", (false || true), "Verdadeiro && Falso",(true || false), "Verdadeiro && Verdadeiro",(true || true));
		
		//tabela-verdade para o operador & (E lógico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n" , "Condicional E (&&)", "Falso && Falso", (false && false),
				"Falso && Verdadeiro", (false && true), "Verdadeiro && Falso",(true && false), "Verdadeiro && Verdadeiro",(true && true));
		
		
		
	}

}
