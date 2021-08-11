package _03_print_and_popups._3_world_domination;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import jdk.internal.util.xml.impl.Input;

public class WorldDomination {
	private static Object yes;

	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog(null,"Do you know how to write code?");
		JLabel label = new JLabel (input);
		JFrame frame = new JFrame ();
		JPanel panel = new JPanel ();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,400);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		// 2. If they say "yes", tell them they will rule the world.
		String correct =
				String.format ("Congratulations!!! You will rule the world!");
		if (input.equals(yes)){
		JOptionPane.showMessageDialog(null,correct);
		}
		// 3. Otherwise, tell them to sign up for classes at The League.
		String wrong =
				String.format ("Please sign up for classes at The League");
		//else 
		//JOptionPane.showMessageDialog (null,wrong);	
			
	}
}

