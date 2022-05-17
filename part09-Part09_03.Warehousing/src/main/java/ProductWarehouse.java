public class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        name = productName;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
            name, super.toString());
    }
}
