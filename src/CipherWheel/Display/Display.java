package CipherWheel.Display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CipherWheel.Functionality.DisplayFunctionality;

public class Display extends JFrame {
	
	private static final int WIDTH = 675, HEIGHT = 575;
	private JFrame frame;
	private JButton encrypt, decrypt;
	private JTextField input;
	private JPanel buttonPanel, textPanel, topPanel;
	
	private DisplayFunctionality displayFunction;
	
	private static final long serialVersionUID = 3396169739867335571L;

	public Display(DisplayFunctionality displayFunction) {
		frame = new JFrame("Cipher Wheel");
		
		this.displayFunction = displayFunction;
		
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		
		
		/*
		 * Panels to set the buttons and text fields 
		 */
		
		topPanel = new JPanel();
		topPanel.setBackground(Color.LIGHT_GRAY);
		topPanel.setLayout(new FlowLayout());
		
		textPanel = new JPanel();
		textPanel.setBackground(Color.LIGHT_GRAY);
		textPanel.setLayout(new FlowLayout());
	
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setLayout(new FlowLayout());
		
		
		/*
		 * Encrypt Button that will connect to the display function and start
		 * the other scripts to run
		 */
		
		encrypt = new JButton("Encrypt");
		encrypt.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayFunction.Connecter(encrypt.getText());
				}
			}
		);
		
		decrypt = new JButton("Decrpt");
		decrypt.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						displayFunction.Connecter(decrypt.getText());
					}
				}
			);
		
		buttonPanel.add(encrypt);
		buttonPanel.add(decrypt);
		
		input = new JTextField(20);
		textPanel.add(input);
		
		topPanel.add(textPanel);
		topPanel.add(buttonPanel);
		
		frame.add(topPanel, BorderLayout.PAGE_START);
		frame.setVisible(true);
	}
}
