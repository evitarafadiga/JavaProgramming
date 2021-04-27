package capitulo05;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ExtraShapeThread extends JPanel{
		
		private int choice; //escolha do usuário de qual forma desenhar
		
		//construtor configura a escolha do usuário
		public ExtraShapeThread (int userChoice)
		{
			choice = userChoice;
		}
		
		//desenha a cascata com as formas
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			for (int i = 0; i < 20; i++) 
			{
				
				//seleciona a forma com base na escolha
				switch (choice)
				{
				case 1: //desenha retângulos
					g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					g.drawRect(2 + i * 10, 2 + i * 10, 30 + i * 10, 30 + i * 10);
					
					break;
				case 2: //desenha ovais
					g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					g.drawOval(7 + i * 10, 7 + i * 10, 21 + i * 10, 21 + i * 10);
					break;
				}
				
				
			}
		}
	}

