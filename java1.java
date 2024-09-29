public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        // Create an invoice
        Invoice invoice = new Invoice("1234", "Hammer", 3, 12.99);
        
        // Calculate and display the invoice amount
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
    }
}