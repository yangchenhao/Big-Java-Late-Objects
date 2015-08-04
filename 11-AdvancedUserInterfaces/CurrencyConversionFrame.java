/*Write a program with a graphical interface that allows the user to convert an amount
 of money between U.S. dollars (USD), euro (EUR), and British pounds (GBP). The
 user interface should have the following elements: a text box to enter the amount to
 be converted, two combo boxes to allow the user to select the currencies, a button
 to make the conversion, and a label to show the result. Display a warning if the user
 does not choose different currencies. Use the following conversion rates:
 1 EUR is equal to 1.42 USD.
 1 GBP is equal to 1.64 USD.
 1 GBP is equal to 1.13 EUR.*/

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CurrencyConversionFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;

    private JLabel fromCurrencyLabel;
    private JLabel toCurrencyLabel;
    private JComboBox<String> fromCurrencyComboBox;
    private JComboBox<String> toCurrencyComboBox;

    private JLabel conversedAmountLabel;
    private JTextField currencyAmountField;

    private JButton converseButton;
    private JLabel resultLabel;

    private static final double EUR_TO_USD = 1.42;
    private static final double GBP_TO_USD = 1.64;
    private static final double GBP_TO_EUR = 1.13;

    public CurrencyConversionFrame() {
        this.createComponents();

        this.setTitle("Currency Convertor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setVisible(true);
    }

    private void createComponents() {
        this.createLabels();
        this.createTextField();
        this.createComboBoxes();

        JPanel topPanel = new JPanel();
        topPanel.add(this.fromCurrencyLabel);
        topPanel.add(this.fromCurrencyComboBox);
        topPanel.add(this.toCurrencyLabel);
        topPanel.add(this.toCurrencyComboBox);
        this.add(topPanel, BorderLayout.NORTH);

        this.converseButton = this.createConverseButton();
        JPanel centerPanel = new JPanel();
        centerPanel.add(this.currencyAmountField);
        centerPanel.add(this.converseButton);
        centerPanel.add(this.resultLabel);
        centerPanel.add(this.conversedAmountLabel);
        this.add(centerPanel, BorderLayout.CENTER);
    }

    private void createLabels() {
        this.fromCurrencyLabel = new JLabel("From:");
        this.toCurrencyLabel = new JLabel("To:");
        this.resultLabel = new JLabel("Conversed:");
        this.conversedAmountLabel = new JLabel("0.00");
    }

    private void createTextField() {
        final int FIELD_WIDTH = 10;
        this.currencyAmountField = new JTextField(FIELD_WIDTH);
    }

    private void createComboBoxes() {
        this.fromCurrencyComboBox = new JComboBox<String>();
        this.fromCurrencyComboBox.setEditable(false);
        this.fromCurrencyComboBox.addItem("USD");
        this.fromCurrencyComboBox.addItem("GBP");
        this.fromCurrencyComboBox.addItem("EUR");
        this.toCurrencyComboBox = new JComboBox<String>();
        this.toCurrencyComboBox.setEditable(false);
        this.toCurrencyComboBox.addItem("USD");
        this.toCurrencyComboBox.addItem("GBP");
        this.toCurrencyComboBox.addItem("EUR");
    }

    private JButton createConverseButton() {
        JButton button = new JButton("Converse");
        ActionListener listener = new ConvertListener();
        button.addActionListener(listener);

        return button;
    }
    
    class ConvertListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent action) {
            double balance = 0;

            try {
                balance = Double.parseDouble(currencyAmountField.getText());
                if (balance <= 0) {
                    throw new IllegalArgumentException();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Error: Currency amount must be a positive number!",
                        "Invalid currency amount!", JOptionPane.ERROR_MESSAGE);
            }

            String fromCurrency = fromCurrencyComboBox.getSelectedItem().toString();
            String toCurrency = toCurrencyComboBox.getSelectedItem().toString();

            if (fromCurrency.equals(toCurrency)) {
                JOptionPane.showMessageDialog(null,
                        "Error: Same currencies to convert from and convert to selected!",
                        "Invalid currency conversion!", JOptionPane.ERROR_MESSAGE);
            } else {
                if (fromCurrency.equals("EUR")) {
                    if (toCurrency.equals("USD")) {
                        conversedAmountLabel.setText(String.format("%.2f", balance * EUR_TO_USD));
                    } else {
                        conversedAmountLabel.setText(String.format("%.2f", balance / GBP_TO_EUR));
                    }
                } else if (fromCurrency.equals("GBP")) {
                    if (toCurrency.equals("USD")) {
                        conversedAmountLabel.setText(String.format("%.2f", balance * GBP_TO_USD));
                    } else {
                        conversedAmountLabel.setText(String.format("%.2f", balance * GBP_TO_EUR));
                    }
                } else if (fromCurrency.equals("USD")) {
                    if (toCurrency.equals("EUR")) {
                        conversedAmountLabel.setText(String.format("%.2f", balance / EUR_TO_USD));
                    } else {
                        conversedAmountLabel.setText(String.format("%.2f", balance / GBP_TO_USD));
                    }
                }
            }
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new CurrencyConversionFrame();
    }
}