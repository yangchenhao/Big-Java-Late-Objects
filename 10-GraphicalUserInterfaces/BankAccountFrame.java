/*Write a graphical application simulating a bank account. Supply text fields and buttons
for depositing and withdrawing money, and for displaying the current balance in a label.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BankAccountFrame extends JFrame {
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 550;

    private JButton depositButton;
    private JButton withdrawButton;
    private JLabel infoBalanceLabel;
    private JLabel currentBalanceLabel;
    private JLabel amountLabel;
    private JTextField amountField;
    private JTextArea historyTransactions;
    private JScrollPane scrollHistoryTransactions;
    private JPanel panel;

    private static final double INITIAL_BALANCE = 1000;
    private double balance;

    public BankAccountFrame() {
        this.balance = INITIAL_BALANCE;
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void createComponents() {
        this.createTextArea();
        this.createLabels();
        this.createButtons();
        this.createTextField();
        this.createScrollPane();
    }

    private void createTextArea() {
        final int ROWS = 30;
        final int COLUMNS = 30;
        this.historyTransactions = new JTextArea(ROWS, COLUMNS);
        this.historyTransactions.setEditable(false);
    }

    public void createLabels() {
        this.amountLabel = new JLabel("Amount: ");
        this.currentBalanceLabel = new JLabel(String.valueOf(balance));
        this.infoBalanceLabel = new JLabel("Balance: ");
    }

    private void createButtons() {
        class AddRemoveAmountListener implements ActionListener {
            private String action;

            public AddRemoveAmountListener(String action) {
                this.action = action.toLowerCase();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountField.getText());
                    if (amount < 0) {
                        historyTransactions.append("Error: negative amount!\n");
                        throw new IllegalArgumentException();
                    }
                    if (this.action.equals("deposit")) {
                        balance += amount;
                        historyTransactions.append("Deposited " + amount + "\n");
                        currentBalanceLabel.setText(String.valueOf(balance));
                    } else if (action.equals("withdraw")) {
                        if (balance - amount >= 0) {
                            balance -= amount;
                            historyTransactions.append("Withdrew " + amount + "\n");
                            currentBalanceLabel.setText(String.valueOf(balance));
                        } else {
                            historyTransactions.append("Error: withdraw amount exceeds balance\n");
                            throw new IllegalArgumentException();
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Amount must be a positive number! "
                            + "Also withdraw amount must be less or equal to current balance.",
                            "Invalid number!", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        depositButton = new JButton("Deposit");
        ActionListener depositListener = new AddRemoveAmountListener("deposit");
        depositButton.addActionListener(depositListener);

        withdrawButton = new JButton("Withdraw");
        ActionListener withdrawListener = new AddRemoveAmountListener("withdraw");
        withdrawButton.addActionListener(withdrawListener);
    }

    private void createTextField() {
        final int FIELD_WIDTH = 10;
        this.amountField = new JTextField(FIELD_WIDTH);
        this.amountField.setText("");
    }

    public void createScrollPane() {
        this.scrollHistoryTransactions = new JScrollPane(this.historyTransactions);
    }

    public void createPanel() {
        this.panel = new JPanel();
        this.panel.add(this.withdrawButton);
        this.panel.add(this.amountLabel);
        this.panel.add(this.amountField);
        this.panel.add(this.depositButton);
        this.panel.add(this.infoBalanceLabel);
        this.panel.add(this.currentBalanceLabel);
        this.panel.add(this.scrollHistoryTransactions);
        this.add(panel);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        JFrame frame = new BankAccountFrame();
    }
}