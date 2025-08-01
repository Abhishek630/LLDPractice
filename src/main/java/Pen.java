import java.util.Objects;

public class Pen extends StationeryItem {
    String type;
    Boolean refillable;

    public Pen(String brand, String color, double price, String type, Boolean refillable) {
        super(brand, price,color);
        this.type = type;
        this.refillable = refillable;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Double.compare(price, pen.price) == 0 && Objects.equals(brand, pen.brand) && Objects.equals(color, pen.color) && Objects.equals(type, pen.type) && Objects.equals(refillable, pen.refillable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, price, type, refillable);
    }


    @Override
    public String toString() {
        return "Pen{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", refillable=" + refillable +
                '}';
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRefillable() {
        return refillable;
    }

    public void setRefillable(Boolean refillable) {
        this.refillable = refillable;
    }


    @Override
    public void showDisplay() {
        System.out.println("Brand " + brand);
        System.out.println("Color " + color);
        System.out.println("Price " + getPrice());
        System.out.println("Type " + type);
        System.out.println("Refillable "+ refillable);
    }


}
