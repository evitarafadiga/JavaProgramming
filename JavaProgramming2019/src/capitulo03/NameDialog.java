package capitulo03;

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		String message = String.format("Bem-vindo, %s, ao Java Programming!",  name);
		
		JOptionPane.showMessageDialog(null, message);
	}

}
