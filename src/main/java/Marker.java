import java.util.Objects;

public class Marker extends StationeryItem {

    boolean isPermanent;
    String inkType;

    public Marker(String brand, double price, String color, boolean isPermanent, String inkType) {
        super(brand, price, color);
        this.isPermanent = isPermanent;
        this.inkType = inkType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Marker marker = (Marker) o;
        return isPermanent == marker.isPermanent && Objects.equals(inkType, marker.inkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPermanent, inkType);
    }

    @Override
    public void showDisplay() {

        System.out.println("Brand " + brand);
        System.out.println("Color " + color);
        System.out.println("Price " + getPrice());
        System.out.println("Permanent " + isPermanent);
        System.out.println("InkType "+ inkType);
    }
}
