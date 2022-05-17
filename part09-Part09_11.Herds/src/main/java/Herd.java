import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable member : herd) {
            member.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Movable member : herd) {
            result += member + "\n";
        }
        return result;
    }
}
