package invoice;

public class LineItem {
    private int quantity;
    private Product product;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return this.product.getPrice() * quantity;
    }

    public String format() {
        String productDescription = this.product.getDescription();
        double productPrice = this.product.getPrice();
        double totalPrice = this.getTotalPrice();
        String product = String.format("%-30s%8.2f%5d%8.2f", productDescription, productPrice, this.quantity, totalPrice);
        
        return product;
    }
}