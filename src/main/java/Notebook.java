import java.util.Objects;

public class Notebook extends StationeryItem {

    int pages;
    String size;

    public Notebook(String brand, double price, String color,  int pages, String size) {
        super(brand,price,color);
        this.pages = pages;
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void showDisplay() {
        System.out.println("Brand " + brand);
        System.out.println("Color " + color);
        System.out.println("Price " + price);
        System.out.println("Pages " + pages);
        System.out.println("Size "+ size);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Double.compare(price, notebook.price) == 0 && Objects.equals(brand, notebook.brand) && Objects.equals(color, notebook.color) && Objects.equals(pages, notebook.pages) && Objects.equals(size, notebook.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand,price,color,pages, size);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "pages=" + pages +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
