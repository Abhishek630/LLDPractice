import java.util.Objects;

public class Pen extends StationeryItem {
    private String type;
    private Boolean IsRefillable;

    public Pen(String brand, String color, double price, String type, Boolean IsRefillable) {
        super(brand, price,color);
        this.type = type;
        this.IsRefillable = IsRefillable;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Double.compare(price, pen.price) == 0 && Objects.equals(brand, pen.brand) && Objects.equals(color, pen.color) && Objects.equals(type, pen.type) && Objects.equals(IsRefillable, pen.IsRefillable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, price, type, IsRefillable);
    }


    @Override
    public String toString() {
        return "Pen{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", refillable=" + IsRefillable +
                '}';
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRefillable() {
        return IsRefillable;
    }

    public void setRefillable(Boolean refillable) {
        this.IsRefillable = refillable;
    }


    @Override
    public void showDisplay() {
        System.out.println("Brand " + brand);
        System.out.println("Color " + color);
        System.out.println("Price " + getPrice());
        System.out.println("Type " + type);
        System.out.println("Refillable "+ IsRefillable);
    }


}
