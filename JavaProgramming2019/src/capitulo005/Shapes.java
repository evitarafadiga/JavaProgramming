package capitulo005;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Shapes extends JPanel{
	
	private int choice; //escolha do usuário de qual forma desenhar
	
	//construtor configura a escolha do usuário
	public Shapes (int userChoice)
	{
		choice = userChoice;
	}
	
	//desenha a cascata com as formas
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for (int i = 0; i < 10; i++) 
		{
			
			//seleciona a forma com base na escolha
			switch (choice)
			{
			case 1: //desenha retângulos
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 2: //desenha ovais
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			}
			
			
		}
	}
}
