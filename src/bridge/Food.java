package bridge;

public abstract class Food {
    private IFood iFood;

    public Food(IFood iFood) {
        this.iFood = iFood;
    }

    public IFood getiFood() {
        return iFood;
    }

    public void setiFood(IFood iFood) {
        this.iFood = iFood;
    }

    public abstract void details(int quantity);
}
