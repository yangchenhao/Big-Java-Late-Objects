/*Write an application with three check boxes labeled “Red”, “Green”, and “Blue”
that adds a red, green, or blue component to the background color of a panel in the
center of the frame. This application can display a total of eight color combinations.*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RGBCheckBoxesFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;

    private JPanel colorPanel;
    private JCheckBox redCheckBox;
    private JCheckBox greenCheckBox;
    private JCheckBox blueCheckBox;

    public RGBCheckBoxesFrame() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void createComponents() {
        createColorPanel();
        createCheckBoxes();
    }

    public void createColorPanel() {
        this.colorPanel = new JPanel();
        this.add(colorPanel, BorderLayout.CENTER);
    }

    public void createCheckBoxes() {
        JPanel checkBoxesPanel = new JPanel();

        this.redCheckBox = new JCheckBox("Red");
        this.greenCheckBox = new JCheckBox("Green");
        this.blueCheckBox = new JCheckBox("Blue");
        
        ChangeBackgroundColorListener listener = new ChangeBackgroundColorListener();
        
        this.redCheckBox.addActionListener(listener);
        this.greenCheckBox.addActionListener(listener);
        this.blueCheckBox.addActionListener(listener);

        checkBoxesPanel.add(this.redCheckBox);
        checkBoxesPanel.add(this.greenCheckBox);
        checkBoxesPanel.add(this.blueCheckBox);
        this.add(checkBoxesPanel, BorderLayout.SOUTH);
    }

    class ChangeBackgroundColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent action) {
            float red = 0;
            float green = 0;
            float blue = 0;

            if (redCheckBox.isSelected()) {
                red = 1;
            }

            if (greenCheckBox.isSelected()) {
                green = 1;
            }

            if (blueCheckBox.isSelected()) {
                blue = 1;
            }
            
            colorPanel.setBackground(new Color(red, green, blue));
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new RGBCheckBoxesFrame();
    }
}