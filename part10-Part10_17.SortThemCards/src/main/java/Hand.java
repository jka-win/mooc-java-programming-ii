import java.util.ArrayList;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void sort() {
        cards.sort(null);
    }

    public void sortBySuit() {
        cards.sort(new BySuitInValueOrder());
    }

    public void print() {
        cards.forEach(System.out::println);
    }

    private int sum() {
        return cards.stream().mapToInt(c -> c.getValue()).sum();
    }

    @Override
    public int compareTo(Hand o) {
        return Integer.compare(sum(), o.sum());
    }
}
