/*Implement a graphical application that simulates a cash register. Provide a text field
for the item price and two buttons for adding the item to the sale, one for taxable
items and one for nontaxable items. In a text area, display the register tape that lists
all items (labeling the taxable items with a *), followed by the amount due. Provide
another button for starting a new sale.*/

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
public class CashRegisterFrame extends JFrame {
    private JLabel itemPriceLabel;
    private JTextField addItemField;
    private JButton addTaxableItemButton;
    private JButton addNonTaxableItemButton;
    private JTextArea currentSaleArea;
    private JScrollPane scrollableCurrentSaleArea;
    private JButton finalizeSaleButton;
    private JPanel panel;
    
    private final static int FRAME_WIDTH = 300;
    private final static int FRAME_HEIGHT = 300;

    public CashRegisterFrame() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    private void createPanel() {
        this.panel = new JPanel();
        this.panel.add(this.itemPriceLabel);
        this.panel.add(this.addItemField);
        this.panel.add(this.addTaxableItemButton);
        this.panel.add(this.addNonTaxableItemButton);
        this.panel.add(finalizeSaleButton);
        this.panel.add(scrollableCurrentSaleArea);
        this.add(panel);
    }

    private void createComponents() {
        this.createLabel();
        this.createTextAreaAndScrollPane();
        this.createTextField();
        this.createButtons();
    }

    private void createTextField() {
        final int ROWS = 5;
        this.addItemField = new JTextField(ROWS);
    }

    private void createTextAreaAndScrollPane() {
        final int ROWS = 10;
        final int COLUMNS = 5;
        this.currentSaleArea = new JTextArea(ROWS, COLUMNS);
        this.currentSaleArea.setEditable(false);
        this.scrollableCurrentSaleArea = new JScrollPane(this.currentSaleArea);
    }

    private void createLabel() {
        this.itemPriceLabel = new JLabel("Item Price: ");
    }

    private void createButtons() {
        this.addTaxableItemButton = new JButton("Add taxable item");
        this.addNonTaxableItemButton = new JButton("Add non-taxable item");
        this.finalizeSaleButton = new JButton("Finalize sale");

        class AddItemListener implements ActionListener {
            private boolean taxable;

            public AddItemListener(boolean taxable) {
                this.taxable = taxable;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double itemPrice = Double.parseDouble(addItemField.getText());
                    if (itemPrice <= 0) {
                        throw new IllegalArgumentException();
                    } else if (this.taxable) {
                        currentSaleArea.append(String.format("*%.2f\n", itemPrice));
                    } else {
                        currentSaleArea.append(String.format("%.2f\n", itemPrice));
                    }
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null,
                            "Error: item price must be a positive number!", "Invalid item price!",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        ActionListener addTaxableListener = new AddItemListener(true);
        this.addTaxableItemButton.addActionListener(addTaxableListener);

        ActionListener addNonTaxableListener = new AddItemListener(false);
        this.addNonTaxableItemButton.addActionListener(addNonTaxableListener);

        this.finalizeSaleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double pricesSum = 0;

                for (String item : currentSaleArea.getText().split("\n")) {
                    int firstCharacter = item.charAt(0);
                    String currentItem = item;
                    
                    if (firstCharacter == '*') {
                        currentItem = item.substring(1, item.length() - 1);
                    }
                    
                    pricesSum += Double.parseDouble(currentItem);
                }

                JOptionPane.showMessageDialog(null, String.format("Your bill is: %.2f", pricesSum),
                        "Finalized sale!", JOptionPane.INFORMATION_MESSAGE);
                
                currentSaleArea.setText("");
            }
        });
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new CashRegisterFrame();
    }
}