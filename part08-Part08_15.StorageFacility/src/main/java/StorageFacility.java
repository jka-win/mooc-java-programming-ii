import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;

    public StorageFacility() {
        units = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        if (!units.containsKey(unit)) {
            units.put(unit, new ArrayList<>());
        }
        units.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return units.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = contents(storageUnit);
        items.remove(item);
        if (items.isEmpty()) {
            units.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(units.keySet());
    }
}
