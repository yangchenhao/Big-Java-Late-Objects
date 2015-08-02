/*Draw a “bull’s eye”—a set of concentric rings in alternating black and white colors.
 Hint: Fill a black circle, then fill a smaller white circle on top, and so on. Your
 program should be composed of classes BullsEyeComponent and Bulls­EyeViewer .*/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BullsEyeViewer extends JFrame {
    private final static int FRAME_WIDTH = 300;
    private final static int FRAME_HEIGHT = 200;
    private JComponent bullsEyeComponent;

    public BullsEyeViewer() {
        this.bullsEyeComponent = new BullsEyeComponent();
        this.add(this.bullsEyeComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class BullsEyeComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLACK);
            g.fillOval(90, 40, 130, 130);

            g.setColor(Color.WHITE);
            g.fillOval(105, 55, 100, 100);

            g.setColor(Color.BLACK);
            g.fillOval(120, 70, 70, 70);

            g.setColor(Color.WHITE);
            g.fillOval(135, 85, 40, 40);

            g.setColor(Color.BLACK);
            g.fillOval(150, 100, 10, 10);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame testFrame = new BullsEyeViewer();
    }
}