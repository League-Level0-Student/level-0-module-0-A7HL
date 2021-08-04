package _03_print_and_popups._2_madlibs;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MadlibsOfTheAmazon {
	static JButton buttonOK = new JButton("Button");
	JTextField inputField = new JTextField();
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  "If you find yourself having to cross a piranha-infested river, here's how to do it...";
		JLabel label = new JLabel (prompt);
		JFrame frame = new JFrame ("MadLibs");
		JPanel panel = new JPanel ();
		panel.add(buttonOK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
		// Get the player to enter an adjective
		String adjective =JOptionPane.showInputDialog(null,"Enter an adjective");
		
		// Get the player to enter a type of liquid
		String liquid =JOptionPane.showInputDialog(null,"Enter a type of liquid");
		// Get the player to enter a body part
		String bodyPart =JOptionPane.showInputDialog(null,"Enter a body part");
		// Get the player to enter a verb
		String verb =JOptionPane.showInputDialog(null,"Enter a verb");
		// Get the player to enter a place
		String place =JOptionPane.showInputDialog(null,"Enter a place");
		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered by the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		
		String story = 
		String.format("Piranhas are more %s during the day, so cross the river at\n", adjective)  +
		String.format("night. Piranhas are attracted to fresh %s and will most\n", liquid) +
		String.format("likely take a bite out of your %s if you %s. Whatever\n", bodyPart, verb) +
		String.format("you do, if you have an open wound, try to find another way to get\n") +
		String.format("back to the %s. Good luck!", place);
		
		
		
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

	}

	public void getAdjective() {
		JPanel panel = new JPanel ();
		panel.add( new JLabel ("enter an adjective"));
		panel.add(buttonOK);
		panel.add(inputField);
	}
}