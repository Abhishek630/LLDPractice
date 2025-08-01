public class TenPercentDiscount implements DiscountStrategy{
    @Override
    public double apply(double price) {
        return price - 0.1* price;
    }
}