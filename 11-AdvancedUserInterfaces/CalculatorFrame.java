/* Simple Calculator with double numbers, can make +, -, *, / operations */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame {
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 200;
    private JTextField display;

    public CalculatorFrame() {
        this.setLayout(new BorderLayout());

        this.createDisplayField();
        this.createPanel();

        this.setTitle("Calculator");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createDisplayField() {
        this.display = new JTextField("");
        this.display.setEditable(false);
        this.add(this.display, BorderLayout.NORTH);
    }

    private void createPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3));

        buttonPanel.add(this.createDigitButton("7"));
        buttonPanel.add(this.createDigitButton("8"));
        buttonPanel.add(this.createDigitButton("9"));
        buttonPanel.add(this.createOperatorButton("/"));
        buttonPanel.add(this.createDigitButton("4"));
        buttonPanel.add(this.createDigitButton("5"));
        buttonPanel.add(this.createDigitButton("6"));
        buttonPanel.add(this.createOperatorButton("*"));
        buttonPanel.add(this.createDigitButton("1"));
        buttonPanel.add(this.createDigitButton("2"));
        buttonPanel.add(this.createDigitButton("3"));
        buttonPanel.add(this.createOperatorButton("-"));
        buttonPanel.add(this.createDigitButton("0"));
        buttonPanel.add(this.createOperatorButton("."));
        buttonPanel.add(this.createOperatorButton("="));
        buttonPanel.add(this.createOperatorButton("+"));

        this.add(buttonPanel, BorderLayout.CENTER);
    }

    private JButton createDigitButton(String digit) {
        JButton button = new JButton(digit);
        button.addActionListener(new DigitButtonListener(Integer.parseInt(digit)));

        return button;
    }

    private JButton createOperatorButton(String operator) {
        JButton button = new JButton(operator);
        button.addActionListener(new OperatorButtonListener(operator));

        return button;
    }

    class DigitButtonListener implements ActionListener {
        private int digit;

        public DigitButtonListener(int digit) {
            this.digit = digit;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String currentExpression = display.getText();
            display.setText(currentExpression + Integer.toString(digit));
        }
    }

    class OperatorButtonListener implements ActionListener {
        private String operation;

        public OperatorButtonListener(String operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String currentExpression = display.getText();
            display.setText(currentExpression + operation);

            if (operation.equals("=")) {
                int i = 0;
                while (Character.isDigit(currentExpression.charAt(i))
                        || currentExpression.charAt(i) == '.') {
                    i++;
                }
                double firstNumber = Double.parseDouble(currentExpression.substring(0, i));

                char currentOperation = currentExpression.charAt(i);

                int j = i + 1;
                while (Character.isDigit(currentExpression.charAt(i))
                        || currentExpression.charAt(i) == '.') {
                    j++;
                }
                double secondNumber = Double.parseDouble(currentExpression.substring(i + 1, j + 1));

                if (currentOperation == '+') {
                    String number = String.format("%.2f", firstNumber + secondNumber);
                    display.setText(display.getText() + number);
                } else if (currentOperation == '-') {
                    String number = String.format("%.2f", firstNumber - secondNumber);
                    display.setText(display.getText() + number);
                } else if (currentOperation == '*') {
                    String number = String.format("%.2f", firstNumber * secondNumber);
                    display.setText(display.getText() + number);
                } else if (currentOperation == '/') {
                    String number = String.format("%.2f", firstNumber / secondNumber);
                    display.setText(display.getText() + number);
                }
            }
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new CalculatorFrame();
    }
}