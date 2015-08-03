/*Write a program that displays the Olympic rings. Color the rings in the Olympic
colors. Provide a method drawRing that draws a ring of a given position and color.*/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class OlympicFrame extends JFrame {
    private final static int FRAME_WIDTH = 300;
    private final static int FRAME_HEIGHT = 200;
    
    private JComponent olympicComponent;

    public OlympicFrame() {
        this.olympicComponent = new OlympicComponent();
        this.add(this.olympicComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class OlympicComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            drawOlympicCircle(g, Color.BLUE, 30, 30, 60, 35, 35, 50);
            drawOlympicCircle(g, Color.BLACK, 90, 30, 60, 95, 35, 50);
            drawOlympicCircle(g, Color.RED, 150, 30, 60, 155, 35, 50);
            drawOlympicCircle(g, Color.YELLOW, 60, 60, 60, 65, 65, 50);
            drawOlympicCircle(g, Color.GREEN, 120, 60, 60, 125, 65, 50);
        }

        public void drawOlympicCircle(Graphics g, Color color, int x1, int y1, int r1, int x2, int y2, int r2) {
            g.setColor(color);
            g.fillOval(x1, y1, r1, r1);

            g.setColor(new Color(255, 255, 255, 255));
            g.fillOval(x2, y2, r2, r2);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame testFrame = new OlympicFrame();
    }
}