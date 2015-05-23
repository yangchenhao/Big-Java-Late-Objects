/*
Type in and run the following program:
Then modify it to show a different greeting and image.
*/

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class P1_17 {
	public static void main(String[] args) throws Exception{
		URL imageLocation = new URL(
				"http://img2.wikia.nocookie.net/__cb20130319035908/vampirediaries/images/f/fb/Sheldon_cooper_spock-41675976.jpg");
		
		JOptionPane.showMessageDialog(null, "Bazinga!", "Title",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}