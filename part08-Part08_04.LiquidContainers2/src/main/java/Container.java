public class Container {
    private int amount;
    
    public Container() {
        amount = 0;
    }

    public int contains() {
        return amount;
    }

    public void add(int amount) {
        amount = Math.max(amount, 0);
        this.amount = Math.min(this.amount + amount, 100);
    }

    public void remove(int amount) {
        amount = Math.max(amount, 0);
        this.amount = Math.max(this.amount - amount, 0);
    }

    @Override
    public String toString() {
        return amount + "/100";
    }
}
