/*Write a graphics program that draws 12 strings, one each for the 12 standard colors,
besides Color.WHITE , each in its own color. Provide a class ColorNameViewer and a class
ColorNameComponent .*/

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ColorNameViewer extends JFrame {
    private final static int FRAME_WIDTH = 150;
    private final static int FRAME_HEIGHT = 250;
    private JComponent colorNameComponent;

    public ColorNameViewer() {
        this.colorNameComponent = new ColorNameComponent();
        this.add(this.colorNameComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class ColorNameComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
            g.setColor(Color.BLACK);
            g.drawString("Black", 20, 20);
            g.setColor(Color.BLUE);
            g.drawString("Blue", 20, 40);
            g.setColor(Color.CYAN);
            g.drawString("Cyan", 20, 60);
            g.setColor(Color.GRAY);
            g.drawString("Gray", 20, 80);
            g.setColor(Color.DARK_GRAY);
            g.drawString("Dark Gray", 20, 100);
            g.setColor(Color.LIGHT_GRAY);
            g.drawString("Light Gray", 20, 120);
            g.setColor(Color.GREEN);
            g.drawString("Green", 20, 140);
            g.setColor(Color.MAGENTA);
            g.drawString("Magenta", 20, 160);
            g.setColor(Color.ORANGE);
            g.drawString("Orange", 20, 180);
            g.setColor(Color.PINK);
            g.drawString("Pink", 20, 200);
            g.setColor(Color.RED);
            g.drawString("Red", 20, 220);
            g.setColor(Color.YELLOW);
            g.drawString("Yellow", 20, 240);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame testFrame = new ColorNameViewer();
    }
}