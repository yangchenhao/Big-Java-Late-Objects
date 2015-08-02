/*Write an application with three labeled text fields, one each for the initial amount 
of a savings account, the annual interest rate, and the number of years. Add a button
“Calculate” and a read-only text area to display the balance of the savings account
after the end of each year.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SavingsAccount extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;

    private JButton processButton;
    private JTextField amountField;
    private JTextField interestRateField;
    private JTextField yearsField;
    private JLabel amountLabel;
    private JLabel interestRateLabel;
    private JLabel yearsLabel;
    private JTextArea history;
    private JPanel panel;

    public SavingsAccount() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void createPanel() {
        this.panel = new JPanel();
        this.panel.add(this.amountLabel);
        this.panel.add(this.amountField);
        this.panel.add(this.interestRateLabel);
        this.panel.add(this.interestRateField);
        this.panel.add(this.yearsLabel);
        this.panel.add(this.yearsField);
        this.panel.add(this.history);
        this.panel.add(this.processButton);
        this.add(panel);
    }

    public void createComponents() {
        this.createTextField();
        this.createLabels();
        this.createTextArea();

        this.createButton();
    }

    private void createTextField() {
        final int FIELD_WIDTH = 5;
        this.amountField = new JTextField(FIELD_WIDTH);
        this.amountField.setText("");
        this.interestRateField = new JTextField(FIELD_WIDTH);
        this.interestRateField.setText("");
        this.yearsField = new JTextField(FIELD_WIDTH);
        this.yearsField.setText("");
    }

    public void createLabels() {
        this.amountLabel = new JLabel("Amount: ");
        this.interestRateLabel = new JLabel("Interest: ");
        this.yearsLabel = new JLabel("Years: ");
    }

    public void createTextArea() {
        final int ROWS = 20;
        final int COLS = 20;
        this.history = new JTextArea(ROWS, COLS);
    }

    private void createButton() {
        this.processButton = new JButton("Submit!");
        this.processButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int years = Integer.parseInt(yearsField.getText());
                    double rate = Double.parseDouble(interestRateField.getText());
                    double amount = Double.parseDouble(amountField.getText());

                    String currentAmount = String.format("%.2f\n", amount);
                    history.append(currentAmount);
                    for (int i = 1; i <= years; i++) {
                        double currentInterest = amount * (rate / 100);
                        amount += currentInterest;
                        currentAmount = String.format("%.2f\n", amount);
                        history.append(currentAmount);
                    }
                } catch (IllegalArgumentException exeption) {
                    JOptionPane.showMessageDialog(null, "Text field should be a number!",
                            "Invalid number!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        JFrame frame = new SavingsAccount();
    }
}