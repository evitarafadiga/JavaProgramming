package capitulo04;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth(); //largura total
		int height = getHeight();//altura total
		
		//desenha uma linha a partir do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0, width, height);
		
		g.drawLine(0, height, width, 0);
	}

}
