package OopsBoosterDay4;

public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice(1,"ABC" , 230);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

        DiscountStrategy strategy1 = new NoDiscount();
        DiscountStrategy strategy2 = new HighPriceDiscount();

        invoicePrinter.printInvoice();
        strategy2.discount(invoice);
        invoicePrinter.printInvoice();
    }
}
