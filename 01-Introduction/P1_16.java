/*
Modify the program from Exercise P1.15 so that the dialog continues with the mes-
sage “My name is Hal! What would you like me to do?” Discard the user’s input and
display a message such as
I'm sorry, Dave. I'm afraid I can't do that.
Replace Dave with the name that was provided by the user.
*/

import javax.swing.JOptionPane;

public class P1_16 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, String.format("Hello %s!", name));
		JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
		JOptionPane.showMessageDialog(null, String.format("I\'m sorry, %s. I'm afraid I can't do that.", name));
	}
}
