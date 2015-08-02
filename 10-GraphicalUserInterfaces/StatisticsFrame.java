/*Write a graphical application for computing statistics of a data set. Supply a text
field and but­ton for adding floating-point values, and display the current minimum,
maximum, and average in a label.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class StatisticsFrame extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 50;

    private JButton processButton;
    private JLabel inputLabel;
    private JTextField inputField;
    private JLabel minLabel;
    private JLabel minValueLabel;
    private JLabel maxLabel;
    private JLabel maxValueLabel;
    private JLabel averageLabel;
    private JLabel averageValueLabel;
    private JPanel panel;

    List<Double> allNumbers;

    public StatisticsFrame() {
        this.allNumbers = new ArrayList<Double>();
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void createPanel() {
        this.panel = new JPanel();
        this.panel.add(this.inputLabel);
        this.panel.add(this.inputField);
        this.panel.add(this.processButton);
        this.panel.add(this.minLabel);
        this.panel.add(this.minValueLabel);
        this.panel.add(this.maxLabel);
        this.panel.add(this.maxValueLabel);
        this.panel.add(this.averageLabel);
        this.panel.add(this.averageValueLabel);
        this.add(panel);
    }

    public void createComponents() {
        this.createTextField();
        this.createLabels();
        this.createButton();
    }

    private void createTextField() {
        final int FIELD_WIDTH = 5;
        this.inputField = new JTextField(FIELD_WIDTH);
        this.inputField.setText("");
    }

    public void createLabels() {
        this.inputLabel = new JLabel("Number: ");
        this.minLabel = new JLabel("Min:");
        this.maxLabel = new JLabel("Max:");
        this.averageLabel = new JLabel("Average:");
        this.minValueLabel = new JLabel("");
        this.maxValueLabel = new JLabel("");
        this.averageValueLabel = new JLabel("");
    }

    private void createButton() {
        this.processButton = new JButton("Submit!");
        this.processButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputNumber = Double.parseDouble(inputField.getText());
                    allNumbers.add(inputNumber);

                    double minimumNumber = getMinNumber(allNumbers);
                    double maximumNumber = getMaxNumber(allNumbers);

                    if (inputNumber <= minimumNumber) {
                        minValueLabel.setText(Double.toString(inputNumber));
                    }

                    if (inputNumber >= maximumNumber) {
                        maxValueLabel.setText(Double.toString(inputNumber));
                    }

                    double averageNumber = StatisticsFrame.getAverageNumber(allNumbers);
                    String averageNumberText = String.format("%.1f", averageNumber);
                    averageValueLabel.setText(averageNumberText);

                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Text field should be a number!",
                            "Invalid number!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static double getMinNumber(List<Double> numbers) {
        double minimumNumber = Double.MAX_VALUE;

        for (Double number : numbers) {
            if (number < minimumNumber) {
                minimumNumber = number;
            }
        }

        return minimumNumber;
    }

    public static double getMaxNumber(List<Double> numbers) {
        double maximumNumber = Double.MIN_VALUE;

        for (Double number : numbers) {
            if (number > maximumNumber) {
                maximumNumber = number;
            }
        }

        return maximumNumber;
    }

    public static double getAverageNumber(List<Double> numbers) {
        double sum = 0;

        for (Double number : numbers) {
            sum += number;
        }

        return sum / numbers.size();
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        JFrame frame = new StatisticsFrame();
    }
}