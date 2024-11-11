package template;

public abstract class FoodItem {
    private int quantity;

    public FoodItem(int quantity) {
        this.quantity = quantity;
    }

    public final void prepare() {
        prepareIngredients();
        cook();
        pack();
        serve();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void prepareIngredients();
    public abstract void cook();
    public abstract void pack();
    public abstract void serve();
}
