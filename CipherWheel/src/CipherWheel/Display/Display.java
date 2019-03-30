package CipherWheel.Display;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Display extends JFrame {
	
	private static final int WIDTH = 500, HEIGHT = 450;
	private JFrame frame;
	private static final long serialVersionUID = 3396169739867335571L;

	public Display() {
		frame = new JFrame("Cipher Wheel");
		
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		frame.setLocationRelativeTo(null);
	}
}
