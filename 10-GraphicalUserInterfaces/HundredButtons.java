/*Write a program that shows a square frame filled with 100 buttons labeled 1 to 100.
Nothing needs to happen when you press any of the buttons.*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class HundredButtons extends JFrame {
    private static final int FRAME_HEIGHT = 400;
    private static final int FRAME_WIDTH = 500;

    private JPanel panel;

    public HundredButtons() {
        this.panel = new JPanel();
        this.makeButtons();
        this.add(this.panel);

        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void makeButtons() {
        for (int i = 1; i < 101; i++) {
            String buttonLabel = "" + i;
            this.panel.add(new JButton(buttonLabel));
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new HundredButtons();
    }
}