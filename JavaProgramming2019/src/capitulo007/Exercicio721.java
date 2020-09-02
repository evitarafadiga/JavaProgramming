package capitulo007;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Exercicio721 extends JPanel{
	
	private final static Color VIOLET = new Color(128, 0, 128);

	public Exercicio721() {
		setBackground(Color.WHITE);
	}
	
	private Color[] colors = {VIOLET};
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int radius = 20;
		
		String [][] floor = new String [20][20];
		
		int centerX = 0;
		int centerY = 0;
		
		for (int counter = colors.length; counter > 0; counter--) {
			g.setColor(colors[counter -1]);
			
			g.fillArc(centerX - counter * radius, centerY - counter * radius, counter * radius * 2, counter * radius * 2, 180 , 180);
					}
	}

}
