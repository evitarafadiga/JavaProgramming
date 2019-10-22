package capitulo004;

import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		DrawPanel panel = new DrawPanel();
		
		JFrame application = new JFrame();
		
		//configura o frame para ser encerrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel); //adiciona o painel ao frame
		application.setSize(250,350); // configura o tamanho do frame
		application.setVisible(true);// torna o frame visível
	}

}