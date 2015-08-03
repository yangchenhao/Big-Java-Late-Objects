/*Modify the drawItalianFlag method in How To 10.1 to draw any flag with three horizontal
colored stripes. Write a program that displays the German and Hungarian flags.*/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlagViewer extends JFrame {
    private final static int FRAME_WIDTH = 300;
    private final static int FRAME_HEIGHT = 200;
    
    private JComponent flagComponent;

    public FlagViewer() {
        this.flagComponent = new FlagComponent();
        this.add(this.flagComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class FlagComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            // German Flag
            drawFlag(g, Color.BLACK, Color.RED, Color.YELLOW);

            // Hungarian Flag
            drawFlag(g, Color.RED, Color.WHITE, Color.GREEN);
        }

        public void drawFlag(Graphics g, Color first, Color second, Color third) {
            g.setColor(first);
            g.fillRect(80, 30, 150, 40);
            g.setColor(second);
            g.fillRect(80, 70, 150, 40);
            g.setColor(third);
            g.fillRect(80, 110, 150, 40);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame testFrame = new FlagViewer();
    }
}