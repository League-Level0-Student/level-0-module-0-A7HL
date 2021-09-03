package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		 int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		 String input = JOptionPane.showInputDialog(null,"What's 1000 - 7");
		 

				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
		 String correct =
	                "CORRECT";
	        String wrong =
	                "WRONG";
	                if(input.equals("993")) {
	                    JOptionPane.showMessageDialog(null,correct);
	                    score +=-1;
	                }else {
	                    JOptionPane.showMessageDialog(null,wrong);
	                    score +=-10;
	              
	                }	                              		
	                JOptionPane.showMessageDialog(null, score);
	                
	                
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String input2 = JOptionPane.showInputDialog(null,"What's 993-7");
		
		 String correct1 =
	                "CORRECT";
	        String wrong1 =
	                "WRONG";
	                if(input2.equals("986")) {
	                    JOptionPane.showMessageDialog(null,correct1);
	                    score +=-1;
	                }else {
	                    JOptionPane.showMessageDialog(null,wrong1);
	                    score +=-10;
	              
	                }
	                
	                JOptionPane.showMessageDialog(null, score);
	                
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
