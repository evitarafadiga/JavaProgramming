package capitulo003;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account();
		
		System.out.printf("O nome inicial é: %s%n%n",myAccount.getName());
		
		System.out.println("Por favor insira o nome:");
		String theName = input.nextLine(); //lê uma linha de texto
		myAccount.setName(theName); // insere theName em myAccount
		System.out.println();//gera saída de linha em branco
		
		System.out.printf("O nome no objeto myAccount é:%n%s%n",myAccount.getName());
	}

}
