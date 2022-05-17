import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    private double capacity;
    private List<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        return String.format("Box: %d items, total weight %s kg",
            items.size(), weight());
    }
}
