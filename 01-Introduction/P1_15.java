/*
Type in and run the following program:
Then modify the program to print “Hello, name!”, displaying the name that the user typed in.
*/

import javax.swing.JOptionPane;

public class P1_15
{	
	public static void main(String[] args)
	{
		
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, String.format("Hello %s!", name));
	}
}