/*Write a program to plot the string “HELLO”, using only lines and circles. Do
not call drawString , and do not use System.out.
Make classes LetterH , LetterE , LetterL , and LetterO .*/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HelloViewer extends JFrame {
    private final static int FRAME_WIDTH = 600;
    private final static int FRAME_HEIGHT = 300;
    
    private JComponent helloComponent;

    public HelloViewer() {
        this.helloComponent = new HelloComponent();
        this.add(this.helloComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class HelloComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.GREEN);
            drawH(g, 80, 120, 100, 200, 150);
            drawE(g, 160, 200, 100, 150, 200);
            drawL(g, 240, 280, 100, 200);
            drawL(g, 320, 360, 100, 200);
            drawO(g, 400, 440, 100, 200);
        }

        public void drawH(Graphics g, int x1, int x2, int y1, int y2, int y3) {
            g.drawLine(x1, y1, x1, y2);
            g.drawLine(x2, y1, x2, y2);
            g.drawLine(x1, y3, x2, y3);
        }

        public void drawE(Graphics g, int x1, int x2, int y1, int y2, int y3) {
            g.drawLine(x1, y1, x1, y3);
            g.drawLine(x1, y1, x2, y1);
            g.drawLine(x1, y2, x2, y2);
            g.drawLine(x1, y3, x2, y3);
        }

        public void drawL(Graphics g, int x1, int x2, int y1, int y2) {
            g.drawLine(x1, y1, x1, y2);
            g.drawLine(x1, y2, x2, y2);
        }

        public void drawO(Graphics g, int x1, int x2, int y1, int y2) {
            g.drawLine(x1, y2, x2, y2);
            g.drawLine(x1, y1, x2, y1);
            g.drawLine(x1, y1, x1, y2);
            g.drawLine(x2, y1, x2, y2);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new HelloViewer();
    }
}