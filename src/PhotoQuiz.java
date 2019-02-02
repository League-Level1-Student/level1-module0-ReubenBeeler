/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window
                int score = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String imageURL = "data:image/jpeg;base64,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";
		// 2. create a variable of type "Component" that will hold your image
                Component imageHolder;
		// 3. use the "createImage()" method below to initialize your Component
                imageHolder = createImage(imageURL);
		// 4. add the image to the quiz window
                quizWindow.add(imageHolder);
		// 5. call the pack() method on the quiz window
                quizWindow.pack();
		// 6. ask a question that relates to the image
                String answer = JOptionPane.showInputDialog("What is this object?");
		// 7. print "CORRECT" if the user gave the right answer
                if (answer.equals("pi pie")) {
                	JOptionPane.showMessageDialog(null, "\nCORRECT");
                	score += 1;
		// 8. print "INCORRECT" if the answer is wrong
                } else {
                	JOptionPane.showMessageDialog(null, "\nINCORRECT");
                }
                JOptionPane.showMessageDialog(null, "You have a score of " + score + " out of 1 points.");
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
                quizWindow.remove(imageHolder);
		// 10. find another image and create it (might take more than one line of code)
                Component image2 = createImage("https://patch.com/img/cal/sites/default/files/styles/t600x450/public/users/23045023/20180701174547/d5ded1be-3441-4735-9956-f6da062c9754.png");
		// 11. add the second image to the quiz window
                quizWindow.add(image2);
		// 12. pack the quiz window
                quizWindow.pack();
		// 13. ask another question
                String answer2 = JOptionPane.showInputDialog("What is the name of this organization?");
		// 14+ check answer, say if correct or incorrect, etc.
                if (answer2.equals("The League of Amazing Programmers")) {
                	JOptionPane.showMessageDialog(null, "\nCORRECT");
                	score += 1;
                } else {
                	JOptionPane.showMessageDialog(null, "\nINCORRECT");
                }
                JOptionPane.showMessageDialog(null, "You have a score of " + score + " out of 2 points.");
                
                if (score == 0) {
                	JOptionPane.showMessageDialog(null, "\nYou failed ):");
                } else {
                	JOptionPane.showMessageDialog(null, "\nYou passed!");
                }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz __DONE__
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





