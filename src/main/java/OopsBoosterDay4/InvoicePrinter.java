package OopsBoosterDay4;

public class InvoicePrinter {

    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Invoice generated for "
                + invoice.getId()
                + " " + invoice.getProductName()
                + " " + invoice.getPrice());
    }
}
