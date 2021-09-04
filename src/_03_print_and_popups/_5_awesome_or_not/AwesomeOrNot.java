package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	// 1. Make a main method that includes everything below
		public static void main(String[] args) {
		
			
	//This will be used below to make a random number. 
		// 2. Make a variable that will hold a random whole number
		Random ran = new Random(); 
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		int num = ran.nextInt(4);
		
		// 3. Print your variable to the console
		//syso |CTL|+|SPACE|  |ENTER| to get line below.
		System.out.println(num);
		// 4. Get the user to enter something that they think is awesome
			//IMPORT JOptionPane
		String input = JOptionPane.showInputDialog(null,"Enter something you think is awesome");
		// 5. If your variable is  0
			// -- tell the user whatever they entered is awesome!
		String awesome =
				String.format("%s is awesome!", input);
		String ok =
				String.format("%s is ok", input);
		String boring =
				String.format("%s is boring", input);
		String trash =
				String.format("%s is trash", input);
			if(num == 0) {
				JOptionPane.showMessageDialog(null,awesome);
			}
		// 6. If your variable is  1	
				// -- tell the user whatever they entered is ok.
			if(num == 1) {
				JOptionPane.showMessageDialog(null, ok);
			}
		// 7. If your variable is  2 
			// -- tell the user whatever they entered is boring.
			if(num==2) {
				JOptionPane.showMessageDialog(null, boring);
			}
		// 8. If your variable is  3
			// -- invent your own message to give to the user (be nice).
			if (num==3) {
				JOptionPane.showMessageDialog(null, trash);
			}
		}
}

