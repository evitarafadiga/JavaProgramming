package capitulo003;

public class Invoice {

	private String numero;
	private String descricao;
	private int qtde = 0;
	private double precoItem = 0;
	
	public Invoice (String numero, String descricao, int qtde, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.qtde = qtde;
		this.precoItem = precoItem;
	}
	public String getNumero() {
		return numero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQtde() {
		return qtde;
	}
	public double getPrecoItem() {
		return precoItem;
	}
	
	public double getInvoiceAmount(double invoiceAmount) {
		
		if (qtde > 0 && precoItem > 0) {
			invoiceAmount = precoItem * qtde;
			
			return invoiceAmount;
		} else {
			
			return invoiceAmount = 0;
			
		}		
		
	}
}
