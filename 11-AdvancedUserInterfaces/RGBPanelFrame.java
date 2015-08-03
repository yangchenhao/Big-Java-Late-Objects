/*Write an application with three buttons labeled “Red”, “Green”, and “Blue” that
 changes the background color of a panel in the center of the frame to red, green,
 or blue.
 
 Add icons to the buttons of Exercise P11.1. Use a JButton constructor with an Icon
 argument and supply an ImageIcon.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class RGBPanelFrame extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private JPanel colorPanel;

    public RGBPanelFrame() {
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        createColorPanel();
        createPanels();
    }

    private void createColorPanel() {
        this.colorPanel = new JPanel();
        this.add(colorPanel, BorderLayout.CENTER);
    }

    private JPanel createButtonsPanel() {
        JPanel buttonsPanel = new JPanel(new GridLayout(3, 1));

        JButton redButton = createButton("Red", Color.RED);
        JButton greenButton = createButton("Green", Color.GREEN);
        JButton blueButton = createButton("Blue", Color.BLUE);

        buttonsPanel.add(redButton);
        buttonsPanel.add(greenButton);
        buttonsPanel.add(blueButton);

        return buttonsPanel;
    }

    private void createPanels() {
        JPanel allButtonsPanel = new JPanel();

        JPanel buttonsPanel = createButtonsPanel();
        JPanel radioButtonsPanel = createRadioButtonsPanel();

        allButtonsPanel.add(buttonsPanel, BorderLayout.SOUTH);
        allButtonsPanel.add(radioButtonsPanel, BorderLayout.CENTER);

        this.add(allButtonsPanel, BorderLayout.SOUTH);
    }

    private JPanel createRadioButtonsPanel() {
        JPanel radioButtonsPanel = new JPanel();

        JRadioButton redRadioButton = createRadioButton("Red", Color.RED);
        JRadioButton greenRadioButton = createRadioButton("Green", Color.GREEN);
        JRadioButton blueRadioButton = createRadioButton("Blue", Color.BLUE);

        ButtonGroup group = new ButtonGroup();
        group.add(redRadioButton);
        group.add(greenRadioButton);
        group.add(blueRadioButton);

        radioButtonsPanel.add(redRadioButton);
        radioButtonsPanel.add(greenRadioButton);
        radioButtonsPanel.add(blueRadioButton);

        return radioButtonsPanel;
    }

    private JButton createButton(String label, Color color) {
        JButton button = new JButton(label);
        button.addActionListener(new ChangeBackgroundListener(color));

        return button;
    }

    private JRadioButton createRadioButton(String label, Color color) {
        JRadioButton radioButton = new JRadioButton(label);
        radioButton.addActionListener(new ChangeBackgroundListener(color));

        return radioButton;
    }

    class ChangeBackgroundListener implements ActionListener {
        private Color color;

        public ChangeBackgroundListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent action) {
            colorPanel.setBackground(color);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new RGBPanelFrame();
    }
}