/*Write an application with three buttons labeled “Red”, “Green”, and “Blue” that
changes the background color of a panel in the center of the frame to red, green, or blue.

Add icons to the buttons of Exercise P11.1. Use a JButton constructor with an Icon
argument and supply an ImageIcon.

Write an application with three radio buttons labeled “Red”, “Green”, and “Blue”
that changes the background color of a panel in the center of the frame to red, green, or blue.*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class RGBColorFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    private JPanel colorPanel;
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;

    public RGBColorFrame() {
        this.createComponents();
        this.setTitle("RGB Color Sliders");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class ColorListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            setFrameColor();
        }
    }

    private void createComponents() {
        this.createPanel();
        this.createSliders();
        this.setFrameColor();
    }

    private void createPanel() {
        this.colorPanel = new JPanel();
        this.add(this.colorPanel, BorderLayout.CENTER);
    }

    private void createSliders() {
        ChangeListener listener = new ColorListener();

        this.redSlider = new JSlider(0, 255, 0);
        this.redSlider.addChangeListener(listener);

        this.greenSlider = new JSlider(0, 255, 0);
        this.greenSlider.addChangeListener(listener);

        this.blueSlider = new JSlider(0, 255, 0);
        this.blueSlider.addChangeListener(listener);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 2));

        controlPanel.add(new JLabel("Red"));
        controlPanel.add(this.redSlider);

        controlPanel.add(new JLabel("Green"));
        controlPanel.add(this.greenSlider);

        controlPanel.add(new JLabel("Blue"));
        controlPanel.add(this.blueSlider);

        this.add(controlPanel, BorderLayout.SOUTH);
    }

    private void setFrameColor() {
        int redValue = this.redSlider.getValue();
        int greenValue = this.greenSlider.getValue();
        int blueValue = this.blueSlider.getValue();
        this.colorPanel.setBackground(new Color(redValue, greenValue, blueValue));
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new RGBColorFrame();
    }
}