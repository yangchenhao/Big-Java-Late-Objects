/*Write a program that draws a picture of a house. It could be as simple as the
accom­panying figure, or if you like, make it more elaborate (3-D, skyscraper,
marble col­umns in the entryway, whatever).*/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HouseViewer extends JFrame {
    private final static int FRAME_WIDTH = 300;
    private final static int FRAME_HEIGHT = 300;
    
    private JComponent houseComponent;

    public HouseViewer() {
        this.houseComponent = new HouseComponent();
        this.add(this.houseComponent);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class HouseComponent extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.GREEN);

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
        JFrame frame = new HouseViewer();
    }
}