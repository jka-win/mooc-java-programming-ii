import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box {
    private List<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        items = new ArrayList<>();
        this.capacity = capacity;
    }

    private int getWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    @Override
    public void add(Item item) {
        if (getWeight() + item.getWeight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
