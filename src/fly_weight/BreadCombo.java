package fly_weight;

import java.util.Map;

public class BreadCombo {
    private String drink, eggs, meal, vegetables;
    private Map<String, Double> prizes = Map.of(
            "coffee", 2.5,
            "tea", 2.0,
            "orange juice", 3.0,
            "scrambled eggs", 4.0,
            "boiled eggs", 3.0,
            "salad", 5.0,
            "carrot", 2.0,
            "chicken", 10.0,
            "pork", 12.0,
            "tomato", 1.5
    );

    public BreadCombo() {
    }

    public BreadCombo(String drink, String eggs, String meal, String vegetables) {
        this.drink = drink;
        this.eggs = eggs;
        this.meal = meal;
        this.vegetables = vegetables;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getEggs() {
        return eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getString() {
        return "BreakCombo: " + drink + ", " + eggs + ", " + meal + ", " + vegetables;
    }

    public double getPrice() {
        return prizes.get(drink) + prizes.get(eggs) + prizes.get(meal) + prizes.get(vegetables);
    }
}