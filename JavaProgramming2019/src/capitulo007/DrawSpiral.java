package capitulo007;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpiral extends JPanel {
	
	private Color[] colors =
		{ Color.WHITE, Color.RED};
	
	public DrawSpiral() {
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
		
	int radius = 10;
	
	int centerX = getWidth() / 2;
	int centerY = getHeight() - 250;
	int j = 0;
	
	for (int counter = colors.length; counter > 0; counter--) {
		g.setColor(colors[counter -1]);
			
			g.fillArc(centerX - counter * radius + j, centerY - counter * radius + j, counter * radius * 2 + j, counter * radius * 2 + j, 200 , 360);
			j+=2;
			
		}
	}

}
