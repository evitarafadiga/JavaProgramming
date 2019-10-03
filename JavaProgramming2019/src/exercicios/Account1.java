package exercicios;

public class Account1 {
	
	private String name;
	public void Account1(String name) {
		this.name=name;
	}
	// método  para configurar o nome
		public void setName(String name) {
			this.name = name;
		}
		//método para recuperar o nome do curso
		public String getName() {
			return name;
		}
}
