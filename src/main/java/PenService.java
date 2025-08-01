import java.util.List;
import java.util.stream.Collectors;

public class PenService {

    Pen pen;

    public List<Pen> getRefillablePens(List<Pen> pens) {
       return pens.stream().filter(Pen::getRefillable).collect(Collectors.toList());
    }

    public List<Pen> getPensAbovePrice(List<Pen> pens, double price) {
        return pens.stream().filter(pen -> pen.getPrice()> price).collect(Collectors.toList());
    }

    public List<Pen> getPensByColor(List<Pen> pens, String color) {
        return pens.stream().filter((pen -> pen.getColor().equalsIgnoreCase(color))).collect(Collectors.toList());
    }
}
