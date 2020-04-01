package capitulo003;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Account myAccount = new Account(null, 0);
//		
//		System.out.printf("O nome inicial é: %s%n%n",myAccount.getName());
//		
//		System.out.println("Por favor insira o nome:");
//		String theName = input.nextLine(); //lê uma linha de texto
//		myAccount.setName(theName); // insere theName em myAccount
//		System.out.println();//gera saída de linha em branco
//		
//		System.out.printf("O nome no objeto myAccount é:%n%s%n",myAccount.getName());
		
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		// exibe saldo inicial de cada objeto
		System.out.printf("%s balance: $ %.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $ %.2f %n%n", account2.getName(), account2.getBalance());

		// cria um Scanner para obter entrada a partir da janela de comando
		//Scanner input = new Scanner(System.in);
		System.out.print("Enter deposit amount for account1: \t"); // prompt
		double depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); // adiciona o saldo de account1

		// exibe os saldos
		System.out.printf("%s balance: $ %.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $ %.2f %n%n", account2.getName(), account2.getBalance());

		System.out.print("Enter deposit amount for account2: \t"); // prompt
		depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount); // adiciona ao saldo de account2
		
		System.out.print("Insira o valor total de saque da conta 1: \t");
		double withdrawAmount = input.nextDouble();
		System.out.printf("%n Retirando %.2f do saldo da conta 1...\n",withdrawAmount);
		account1.withdraw(withdrawAmount);
		
		System.out.print("Insira o valor total de saque da conta 2: \t");
		withdrawAmount = input.nextDouble();
		System.out.printf("%n Retirando %.2f do saldo da conta 2...\n",withdrawAmount);
		account1.withdraw(withdrawAmount);

		// exibe os saldos
		System.out.printf("%s balance: $ %.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $ %.2f %n%n", account2.getName(), account2.getBalance());
	}

}
