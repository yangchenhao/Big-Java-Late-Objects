/*Extend Exercise P10.20 so that you can make the houses appear in different colors.
The color should be passed as an argument to the drawHouse method.*/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ColorHouseViewer extends JFrame {
    private final static int FRAME_WIDTH = 300;
    private final static int FRAME_HEIGHT = 300;
    
    private JComponent colorHouseComponent;

    public ColorHouseViewer() {
        this.colorHouseComponent = new ColorHouseComponent();
        this.add(this.colorHouseComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class ColorHouseComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            drawColorHouse(g, Color.RED);
        }

        public void drawColorHouse(Graphics g, Color color) {
            g.setColor(color);

            // House square
            g.drawLine(100, 100, 200, 100);
            g.drawLine(100, 200, 200, 200);
            g.drawLine(100, 100, 100, 200);
            g.drawLine(200, 100, 200, 200);

            // Roof
            g.drawLine(100, 100, 150, 50);
            g.drawLine(200, 100, 150, 50);

            // Door
            g.drawLine(120, 150, 140, 150);
            g.drawLine(120, 150, 120, 200);
            g.drawLine(140, 150, 140, 200);

            // Window
            g.drawLine(160, 130, 190, 130);
            g.drawLine(160, 170, 190, 170);
            g.drawLine(160, 130, 160, 170);
            g.drawLine(190, 130, 190, 170);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new ColorHouseViewer();
    }
}