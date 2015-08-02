/*Write a program that draws two solid squares: one in pink and one in purple. Use
a standard color for one of them and a custom color for the other. Provide a class
TwoSquareViewer and a class TwoSquareComponent .*/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TwoSquareViewer extends JFrame {
    private final static int FRAME_WIDTH = 300;
    private final static int FRAME_HEIGHT = 300;
    private JComponent twoSquareComponent;

    public TwoSquareViewer() {
        this.twoSquareComponent = new TwoSquareComponent();
        this.add(this.twoSquareComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class TwoSquareComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.PINK);
            g.fillRect(20, 20, 100, 100);

            Color purple = new Color(128, 0, 128);
            g.setColor(purple);
            g.fillRect(150, 150, 100, 100);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame testFrame = new TwoSquareViewer();
    }
}