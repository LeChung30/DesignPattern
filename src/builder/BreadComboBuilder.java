package builder;

public class BreadComboBuilder {
    private BreadCombo breakCombo;

    public BreadComboBuilder() {
        this.breakCombo = new BreadCombo(null, null, null, null);
    }

    public BreadComboBuilder setDrink(String drink) {
        this.breakCombo.setDrink(drink);
        return this;
    }

    public BreadComboBuilder setEggs(String eggs) {
        this.breakCombo.setEggs(eggs);
        return this;
    }

    public BreadComboBuilder setMeal(String meal) {
        this.breakCombo.setMeal(meal);
        return this;
    }

    public BreadComboBuilder setVegetables(String vegetables) {
        this.breakCombo.setVegetables(vegetables);
        return this;
    }

    public BreadCombo build() {
        return breakCombo;
    }
}