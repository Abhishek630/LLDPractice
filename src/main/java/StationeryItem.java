public abstract class StationeryItem implements Discountable{

    String brand;
    double price;
    String color;

    public StationeryItem(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "StationaryItem{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void showDisplay();

    @Override
    public void applyDiscount(DiscountStrategy strategy) {
        price = strategy.apply(this.price);
    }
}

