package builder;

import java.util.Map;

public class BreadCombo {
    private String drink, eggs, meal, vegetables;
    private Map<String, Double> prizes = Map.of(
        "coffee", 2.5,
        "tea", 2.0,
        "orange juice", 3.0,
        "scrambled eggs", 4.0,
        "Boiled eggs", 3.0,
        "Salad", 5.0,
        "Carrot", 2.0,
        "Chicken", 10.0,
        "pork", 12.0
    );

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
        return "BreadCombo: " + (drink != null ? drink : "No drink") + ", " +
                (eggs != null ? eggs : "No eggs") + ", " +
                (meal != null ? meal : "No meal") + ", " +
                (vegetables != null ? vegetables : "No vegetables");
    }

    public double getPrice() {
        double total = 0.0;
        if (drink != null) total += prizes.getOrDefault(drink, 0.0);
        if (eggs != null) total += prizes.getOrDefault(eggs, 0.0);
        if (meal != null) total += prizes.getOrDefault(meal, 0.0);
        if (vegetables != null) total += prizes.getOrDefault(vegetables, 0.0);
        return total;
    }
}
