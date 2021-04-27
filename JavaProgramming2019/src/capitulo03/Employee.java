package capitulo03;

public class Employee {
	
	private String nome;
	private String sobrenome;
	private double salario;
	
	public Employee(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		
		if( salario <= 0) {
			salario = 0;
		} else {
			salario += salario * 0.10;
		}
		
		return salario;
		
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
