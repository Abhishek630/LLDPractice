package OopsBoosterDay4;

public class HighPriceDiscount implements  DiscountStrategy{


    @Override
    public void discount(Invoice invoice) {
        invoice.setPrice(invoice.getPrice()* 0.75);
    }
}
