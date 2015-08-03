/*Write a graphical application to implement a currency converter between euros and
U.S. dollars, and vice versa. Provide two text fields for the euro and dollar amounts.
Between them, place two buttons labeled > and < for updating the field on the right
or left. For this exercise, use a conversion rate of 1 euro = 1.42 U.S. dollars.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CurrencyConverterFrame extends JFrame {
    private JLabel euroLabel;
    private JLabel dollarLabel;
    private JTextField euroValueField;
    private JTextField dollarValueField;
    private JButton dollarToEuro;
    private JButton euroToDollar;
    private JPanel panel;

    private final static int FRAME_WIDTH = 400;
    private final static int FRAME_HEIGHT = 100;

    public CurrencyConverterFrame() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        this.createLabels();
        this.createTextFields();
        this.createButtons();
    }
    
    private void createLabels() {
        this.euroLabel = new JLabel("Euro: ");
        this.dollarLabel = new JLabel("Dollar: ");
    }
    
    private void createTextFields() {
        final int ROWS = 5;
        this.euroValueField = new JTextField(ROWS);
        this.dollarValueField = new JTextField(ROWS);
    }
    
    private void createButtons(){
        class ConvertListener implements ActionListener {
            private String currency;

            public ConvertListener(String currency) {
                this.currency = currency;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (currency.equals("dollars")) {
                        double euros = Double.parseDouble(euroValueField.getText());
                        double dollars = euros * 1.42;
                        String dollarsToString = String.format("%.2f", dollars);
                        dollarValueField.setText(dollarsToString);
                    }
                    else if (currency.equals("euros")) {
                        double dollars = Double.parseDouble(dollarValueField.getText());
                        double euros = dollars / 1.42;
                        String eurosToString = String.format("%.2f", euros);
                        euroValueField.setText(eurosToString);
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Currency must be positive number!", "Invalid currency value!",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
       
        this.euroToDollar = new JButton(">");
        ActionListener toEuroListener = new ConvertListener("dollars"); 
        this.euroToDollar.addActionListener(toEuroListener);
        
        this.dollarToEuro = new JButton("<");
        ActionListener toDollarsListener = new ConvertListener("euros");
        this.dollarToEuro.addActionListener(toDollarsListener);
    }

    private void createPanel() {
        this.panel = new JPanel();
        this.panel.add(this.euroLabel);
        this.panel.add(this.euroValueField);
        this.panel.add(this.euroToDollar);
        this.panel.add(this.dollarToEuro);
        this.panel.add(this.dollarLabel);
        this.panel.add(this.dollarValueField);
        this.add(panel);
    }
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new CurrencyConverterFrame();
    }
}