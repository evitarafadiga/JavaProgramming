package capitulo03;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Invoice invoice1 = new Invoice("0001", "Fone com microfone", 19, 4.99);
		Invoice invoice2 = new Invoice("0002", "Batedeira", 2, 340.80);
		Invoice invoice3 = new Invoice("0003", "Ar",1,1.99);
		
		System.out.printf("A fatura numero %s contém %s itens\n do tipo %s\n preço de %s \n O valor total é de %s",invoice1.getNumero(),invoice1.getQtde(), invoice1.getDescricao(),invoice1.getPrecoItem(),invoice1.getInvoiceAmount(0));
		System.out.println("\n");
		System.out.printf("A fatura numero %s contém %s itens\n do tipo %s\n preço de %s \n O valor total é de %s",invoice2.getNumero(),invoice2.getQtde(), invoice2.getDescricao(),invoice2.getPrecoItem(),invoice2.getInvoiceAmount(0));
		System.out.println("\n");
		System.out.printf("A fatura numero %s contém %s itens\n do tipo %s\n preço de %s \n O valor total é de %s",invoice3.getNumero(),invoice3.getQtde(), invoice3.getDescricao(),invoice3.getPrecoItem(),invoice3.getInvoiceAmount(0));
		
		
		
	}

}
