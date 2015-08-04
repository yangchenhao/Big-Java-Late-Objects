package invoice;

public class InvoicePrinter {
    public static void main(String[] args)
   {  
      Address kennyAddress = new Address("Kenny Chapman", "500 Broadway Street", "San Diego", "CA", "98765");
      Invoice kennyInvoice = new Invoice(kennyAddress);
      kennyInvoice.add(new Product("Microwave", 29.95), 3);
      kennyInvoice.add(new Product("Chair", 24.95), 1);
      kennyInvoice.add(new Product("Faith", 19.99), 2);

      System.out.println(kennyInvoice.format());           
   }
}