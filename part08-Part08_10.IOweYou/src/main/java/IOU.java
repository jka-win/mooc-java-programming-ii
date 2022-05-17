import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> ious;

    public IOU() {
        ious = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        ious.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (ious.containsKey(toWhom)) {
            return ious.get(toWhom);
        } else {
            return 0;
        }
    }
}
