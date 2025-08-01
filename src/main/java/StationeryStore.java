import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StationeryStore {
    List<StationeryItem> items;

    public StationeryStore(){
        this.items = new ArrayList<>();
    }

    public void addItems(StationeryItem item){
        items.add(item);
    }

    public void showAllItems(){
        for (StationeryItem item : items){
            item.showDisplay();
            System.out.println();
        }
    }

    public List<StationeryItem> filterByCondition(Predicate<StationeryItem> condition){
        return items.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    public List<StationeryItem> searchByBrandOrMaxPrice(String brand, double maxPrice){
        Predicate<StationeryItem> brandPredicate = item -> item.brand.equalsIgnoreCase(brand);
        Predicate<StationeryItem> maxPricePredicate = item->item.price >= (maxPrice);

        return items.stream()
                .filter(brandPredicate.or(maxPricePredicate))
                .collect(Collectors.toList());
    }

}
