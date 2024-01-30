package wordCounter;

import javax.swing.JOptionPane;

public class wordCounter {

	public static void main(String[] args) {
    

	String input = JOptionPane.showInputDialog("Enter a sentence");
	String[] words = input.split(" ");
	    
    int result = words.length;
    JOptionPane.showMessageDialog(null, "Number of words: " + result);
       
	}

}
