import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ChangeHistory {
    private List<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            return Collections.max(history);
        }
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            return Collections.min(history);
        }
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        } else {
            double total = 0;
            for (double value : history) {
                total += value;
            }
            return total / history.size();
        }
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
