package OopsBoosterDay4;

public class NoDiscount implements  DiscountStrategy{

    @Override
    public void discount(Invoice invoice) {
         invoice.getPrice();
    }
}
