package capitulo007;

import javax.swing.JFrame;

public class Teste721 {
	
	public static void main(String[] args) {

		Exercicio721 panel = new Exercicio721();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,400);
		application.setVisible(true);
		
	}

}
