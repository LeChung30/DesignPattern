package builder;

public class BuilderRun {
    public static void main(String[] args) {
        BreadComboBuilder builder = new BreadComboBuilder();
        BreadCombo combo = builder
            .setDrink("coffee")
            .setEggs("scrambled eggs")
            .setMeal("Chicken")
            .setVegetables("Carrot")
            .build();

        System.out.println(combo.getString() + "\nPrizes: " + combo.getPrice());
    }
}
