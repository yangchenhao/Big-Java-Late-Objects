/*Write a graphical application that produces a restaurant bill.
Provide buttons for ten popular dishes or drink items.
(You decide on the items and their prices.) Provide text fields for
entering less popular items and prices. In a text area, show the
bill, including tax and a suggested tip.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class RestaurantBillFrame extends JFrame {
    private JButton bourbonChickenButton;
    private JButton chickenLazoneButton;
    private JButton scallopedPotatoesButton;
    private JButton mexicanRiceButton;
    private JButton sesameChickenButton;
    private JButton tunaCasseroleButton;
    private JButton steakMarinadeButton;
    private JButton italianWeddingSoupButton;
    private JButton finalizeButton;
    private JLabel priceLabel;
    private JTextField priceField;
    private JPanel panel;
    
    private double wholeBill;

    private final static int FRAME_WIDTH = 400;
    private final static int FRAME_HEIGHT = 200;

    public RestaurantBillFrame() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        this.createLabel();
        this.createTextField();
        this.createButtons();
    }

    private void createLabel() {
        this.priceLabel = new JLabel("Price: ");
    }

    private void createTextField() {
        final int ROWS = 5;
        this.priceField = new JTextField(ROWS);
    }

    private void createButtons() {
        class OrderListener implements ActionListener {
            private double price;
            
            public OrderListener(double price) {
                this.price = price;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                wholeBill += this.price;
            }
        }
        
        this.bourbonChickenButton = new JButton("Bourbon Chicken");
        this.bourbonChickenButton.addActionListener(new OrderListener(30.00));
        this.chickenLazoneButton = new JButton("Chicken Lazone");
        this.chickenLazoneButton.addActionListener(new OrderListener(20.00));
        this.scallopedPotatoesButton = new JButton("Scalloped Potatoes");
        this.scallopedPotatoesButton.addActionListener(new OrderListener(15.00));
        this.mexicanRiceButton = new JButton("Mexican Rice");
        this.mexicanRiceButton.addActionListener(new OrderListener(10.00));
        this.sesameChickenButton = new JButton("Sesame Chicken");
        this.sesameChickenButton.addActionListener(new OrderListener(5.00));
        this.tunaCasseroleButton = new JButton("Tuna Casserole");
        this.tunaCasseroleButton.addActionListener(new OrderListener(50.00));
        this.steakMarinadeButton = new JButton("Steak Marinade");
        this.steakMarinadeButton.addActionListener(new OrderListener(60.00));
        this.italianWeddingSoupButton = new JButton("Italian Wedding");
        this.italianWeddingSoupButton.addActionListener(new OrderListener(20.00));

        this.finalizeButton = new JButton("Finalize Button!");
        this.finalizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wholeBillToString = String.format("%.2f", wholeBill);
                priceField.setText(wholeBillToString);
            }
        });
    }

    private void createPanel() {
        this.panel = new JPanel();
        this.panel.add(this.bourbonChickenButton);
        this.panel.add(this.chickenLazoneButton);
        this.panel.add(this.scallopedPotatoesButton);
        this.panel.add(this.mexicanRiceButton);
        this.panel.add(this.sesameChickenButton);
        this.panel.add(this.tunaCasseroleButton);
        this.panel.add(this.steakMarinadeButton);
        this.panel.add(this.italianWeddingSoupButton);
        this.panel.add(this.finalizeButton);
        this.panel.add(this.priceLabel);
        this.panel.add(this.priceField);
        this.add(panel);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame = new RestaurantBillFrame();
    }
}