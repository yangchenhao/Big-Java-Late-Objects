/*Write a program to plot the following face.
Provide a class FaceViewer and a class Face­ Component .*/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FaceViewer extends JFrame {
    private final static int FRAME_WIDTH = 300;
    private final static int FRAME_HEIGHT = 200;
    private JComponent faceComponent;

    public FaceViewer() {
        this.faceComponent = new FaceComponent();
        this.add(this.faceComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class FaceComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            Color blueviolet = new Color(138, 43, 226);
            g.setColor(blueviolet);

            g.drawLine(100, 140, 180, 140);
            g.drawLine(180, 140, 200, 120);
            g.drawLine(80, 120, 100, 140);

            g.drawOval(100, 80, 20, 20);
            g.drawOval(160, 80, 20, 20);

            g.drawOval(65, 30, 150, 150);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame testFrame = new FaceViewer();
    }
}