/*Write a graphics program that draws your name in red, contained inside a blue
rect­angle. Provide a class NameViewer and a class NameComponent.*/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class NameViewer extends JFrame {

    private final static int FRAME_WIDTH = 150;
    private final static int FRAME_HEIGHT = 150;
    private JComponent nameComponent;

    public NameViewer() {
        this.nameComponent = new NameComponent();
        this.add(this.nameComponent);

        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class NameComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(0, 0, 150, 150);
            g.setColor(Color.RED);
            g.drawString("Stilyan", 50, 50);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame testFrame = new NameViewer();
    }
}