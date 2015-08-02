/*Implement a ButtonViewer1 program as in Exercise P10.3 using only a single listener
class. Hint: Pass the button label to the constructor of the listener.*/

/*Enhance the ButtonViewer1 program so that it prints the date and time at which the
 button was clicked. Hint: System.out.println(new date and time. java.util.Date())
 prints the current date and time.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ButtonViewer3 extends JFrame {
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_WIDTH = 200;

    private static int timesClickedFirstButton;
    private static int timesClickedSecondButton;

    private JPanel panel;
    private JButton buttonOne;
    private JButton buttonTwo;

    public ButtonViewer3() {
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
        String buttonOneLabel = "A! Click me !";
        this.buttonOne = new JButton(buttonOneLabel);
        ActionListener listener = new ClickListener(buttonOneLabel);
        this.buttonOne.addActionListener(listener);
    }

    public void makeButtonTwo() {
        String buttonTwoLabel = "B! Click me !";
        this.buttonTwo = new JButton(buttonTwoLabel);
        ActionListener listener = new ClickListener(buttonTwoLabel);
        this.buttonTwo.addActionListener(listener);
    }

    class ClickListener implements ActionListener {
        private String label;

        public ClickListener(String label) {
            this.label = label;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";

            if (this.label.equals("A! Click me !")) {
                timesClickedFirstButton++;
                message = String.format("I was clicked %d times! Button A!", timesClickedFirstButton);
            } else if (this.label.equals("B! Click me !")) {
                timesClickedSecondButton++;
                message = String.format("I was clicked %d times! Button B!", timesClickedSecondButton);
            }

            System.out.println(message);
            System.out.println(new Date());
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new ButtonViewer3();
    }
}