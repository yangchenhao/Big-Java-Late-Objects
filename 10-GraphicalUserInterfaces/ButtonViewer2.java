/*Enhance the ButtonViewer1 program in Section 10.2.1 so that it has two buttons, each
of which prints a message “I was clicked n times!” whenever the button is clicked.
Each button should have a separate click count.*/

/*Enhance the ButtonViewer1 program in Section 10.2.1 so that it has two buttons
 labeled A and B, each of which prints a message “Button x was clicked!”, where x is
 A or B.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ButtonViewer2 extends JFrame {
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_WIDTH = 200;

    private static int timesClickedFirstButton;
    private static int timesClickedSecondButton;

    private JPanel panel;
    private JButton buttonOne;
    private JButton buttonTwo;

    public ButtonViewer2() {
        this.makeButtonOne();
        this.makeButtonTwo();

        this.panel = new JPanel();
        this.panel.add(this.buttonOne);
        this.panel.add(this.buttonTwo);
        this.add(panel);

        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void makeButtonOne() {
        this.buttonOne = new JButton("A! Click me !");
        ActionListener listener = new ClickListenerButtonOne();
        this.buttonOne.addActionListener(listener);
    }

    public void makeButtonTwo() {
        this.buttonTwo = new JButton("B! Click me!");
        ActionListener listener = new ClickListenerButtonTwo();
        this.buttonTwo.addActionListener(listener);
    }

    class ClickListenerButtonOne implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            timesClickedFirstButton++;
            String message = String.format("I was clicked %d times! Button A!", timesClickedFirstButton);
            System.out.println(message);
        }
    }

    class ClickListenerButtonTwo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            timesClickedSecondButton++;
            String message = String.format("I was clicked %d times! Button B!", timesClickedSecondButton);
            System.out.println(message);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new ButtonViewer2();
    }
}