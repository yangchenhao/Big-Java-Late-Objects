package invoice;

import java.util.ArrayList;

public class Invoice {
    private Address billingAddress;
    private ArrayList<LineItem> items;

    public Invoice(Address anAddress) {
        this.items = new ArrayList<LineItem>();
        this.billingAddress = anAddress;
    }

    public void add(Product product, int quantity) {
        LineItem item = new LineItem(product, quantity);
        this.items.add(item);
    }

    public String format() {
        String invoice = "                     I N V O I C E\n\n";
        invoice += billingAddress.format();
        invoice += String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");
        
        for (LineItem item : this.items) {
            invoice += item.format() + "\n";
        }
        
        invoice += String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());
        
        return invoice;
    }

    private double getAmountDue() {
        double amountDue = 0;
        
        for (LineItem item : this.items) {
            amountDue = amountDue + item.getTotalPrice();
        }
        
        return amountDue;
    }
}