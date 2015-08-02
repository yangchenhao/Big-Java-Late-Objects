/*Write a graphical application describing an earthquake, as in Section 3.3. Supply a
text field and button for entering the strength of the earthquake. Display the
earthquake description in a label.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EarthquakeFrame extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 100;

    private JButton displayEarthquakeButton;
    private JLabel earthquakeFieldLabel;
    private JTextField earthquakeStrengthField;
    private JLabel earthquakeDescriptionLabel;
    private JPanel panel;

    public EarthquakeFrame() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void createPanel() {
        this.panel = new JPanel();
        this.panel.add(this.earthquakeFieldLabel);
        this.panel.add(this.earthquakeStrengthField);
        this.panel.add(this.displayEarthquakeButton);
        this.panel.add(this.earthquakeDescriptionLabel);
        this.add(panel);
    }

    public void createComponents() {
        this.createLabels();
        this.createTextField();
        this.createButtons();
    }

    public void createLabels() {
        this.earthquakeFieldLabel = new JLabel("Earthquake magnitute: ");
        this.earthquakeDescriptionLabel = new JLabel("");
    }

    private void createTextField() {
        final int FIELD_WIDTH = 5;
        this.earthquakeStrengthField = new JTextField(FIELD_WIDTH);
        this.earthquakeStrengthField.setText("");
    }

    private void createButtons() {
        this.displayEarthquakeButton = new JButton("Display description");
        this.displayEarthquakeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double magnitude = Double.parseDouble(earthquakeStrengthField.getText());
                    String description = "";

                    if (magnitude <= 0) {
                        throw new IllegalArgumentException();
                    } else if (magnitude <= 2.5) {
                        description = "Usually not felt, but can be recorded by seismograph.";
                    } else if (magnitude <= 5.5) {
                        description = "Often felt, but only causes minor damage.";
                    } else if (magnitude <= 6.0) {
                        description = "Slight damage to buildings and other structures.";
                    } else if (magnitude <= 6.9) {
                        description = "May cause a lot of damage in very populated areas.";
                    } else if (magnitude <= 7.9) {
                        description = "Major earthquake. Serious damage.";
                    } else {
                        description = "Great earthquake. Can totally destroy communities near the epicenter.";
                    }

                    earthquakeDescriptionLabel.setText(description);
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Magnitude must be a positive number!",
                            "Invalid magnitude level!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        JFrame frame = new EarthquakeFrame();
    }
}