import java.util.List;

public class Main {
    public static void main(String[] args) {

        DiscountStrategy strategy = new TenPercentDiscount();
        Pen pen1 = new Pen("Parker", "Black", 120d, "Ink", true);
        System.out.println("Before Discount");
        pen1.showDisplay();
        pen1.applyDiscount(strategy);
        System.out.println("After Discount");
        pen1.showDisplay();

        System.out.println();

        Pen pen2 = new Pen("Parker", "Orange", 10d, "Ink", true);
        System.out.println("Before Discount");
        pen2.showDisplay();
        pen2.applyDiscount(strategy);
        System.out.println("After Discount");
        pen2.showDisplay();

        System.out.println();

        Notebook note1 = new Notebook("ClassMate", 120, "white",180, "executive");
        System.out.println("Before Discount");
        note1.showDisplay();
        note1.applyDiscount(strategy);
        System.out.println("After Discount");
        note1.showDisplay();

        System.out.println();

        Notebook note2 = new Notebook("Navneet", 210, "orange",240, "register");
        System.out.println("Before Discount");
        note2.showDisplay();
        note2.applyDiscount(strategy);
        System.out.println("After Discount");
        note2.showDisplay();

        System.out.println();


        Marker marker1 = new Marker("Cello", 210, "Black",true, "Refill");
        System.out.println("Before Discount");
        marker1.showDisplay();
        marker1.applyDiscount(strategy);
        System.out.println("After Discount");
        marker1.showDisplay();

        System.out.println();


        System.out.println("Store");
        StationeryStore store = new StationeryStore();
        store.addItems(pen1);
        store.addItems(pen2);
        store.addItems(note1);
        store.addItems(note2);
        store.showAllItems();


        System.out.println(store
                .filterByCondition(stationeryItem -> stationeryItem.getColor().equalsIgnoreCase("ORange")));

        System.out.println();


        System.out.println(store.searchByBrandOrMaxPrice("classMate",150));

    }
}
