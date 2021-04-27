package capitulo05;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExtraShapeThreadTest {
	
	public static void main(String[] args) 
	{
		//obtém a escolha do usuário
		String input = JOptionPane.showInputDialog(
				"Insira 1 para retângulos\n"+
				"Insira 2 para ovais");
		
		int choice = Integer.parseInt(input); //converte a entrada em int
		
		//cria o painel com a entrada do usuário
		ExtraShapeThread panel = new ExtraShapeThread(choice);
		
		JFrame application = new JFrame();//cria um novo JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500,500);
		application.setVisible(true);
		
		
	}

}

