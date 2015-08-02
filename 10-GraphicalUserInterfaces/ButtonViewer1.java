/*Enhance the ButtonViewer1 program in Section 10.2.1 so that it prints a message
“I was clicked n times!” whenever the button is clicked. The value n should be
incremented with each click.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ButtonViewer1 extends JFrame {
    private static final int FRAME_HEIGHT = 100;
    private static final int FRAME_WIDTH = 100;

    private static int timesClicked;

    private JPanel panel;
    private JButton button;

    public ButtonViewer1() {
        this.button = new JButton("Click me!");
        ActionListener listener = new ClickListener();
        this.button.addActionListener(listener);

        this.panel = new JPanel();
        this.panel.add(this.button);
        this.add(panel);

        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class ClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            timesClicked++;
            String message = String.format("I was clicked %d times!", timesClicked);
            System.out.println(message);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new ButtonViewer1();
    }
}