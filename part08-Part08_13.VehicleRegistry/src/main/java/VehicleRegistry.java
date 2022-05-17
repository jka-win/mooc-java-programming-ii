import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry() {
        owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        return owners.putIfAbsent(licensePlate, owner) == null;
    }

    public String get(LicensePlate licensePlate) {
        return owners.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        return owners.remove(licensePlate) != null;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        for (String owner : new HashSet<>(owners.values())) {
            System.out.println(owner);
        }
    }
}
