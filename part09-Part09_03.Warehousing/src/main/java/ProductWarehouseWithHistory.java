public class ProductWarehouseWithHistory extends ProductWarehouse {    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double balance = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return balance;
    }

    public void printAnalysis() {
        System.out.println(String.format(
            "Product: %s\n"
            + "History: %s\n"
            + "Largest amount of product: %f\n"
            + "Smallest amount of product: %f\n"
            + "Average: %f",
            getName(), history(), history.maxValue(), history.minValue(), history.average()));
    }
}
