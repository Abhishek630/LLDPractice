public class HighPriceDiscount implements DiscountStrategy{
    @Override
    public double apply(double price) {
        if(price> 150){
            return 0.7* price;
        }
     return  price;
    }
}
