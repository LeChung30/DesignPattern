package fly_weight;

import java.util.HashMap;
import java.util.Map;

public class BreadComboFactory {
    private static final Map<String, BreadComboFlyWeight> combos = new HashMap<>();

    public static BreadComboFlyWeight getCombo(String drink, String eggs, String meal, String vegetables) {
        String key = drink + eggs + meal + vegetables;
        if (!combos.containsKey(key)) {
            combos.put(key, new BreadComboFlyWeight() {
                private final BreadCombo combo = new BreadCombo(drink, eggs, meal, vegetables);

                @Override
                public void createCombo(BreadCombo breadCombo) {
                    breadCombo.setDrink(combo.getDrink());
                    breadCombo.setEggs(combo.getEggs());
                    breadCombo.setMeal(combo.getMeal());
                    breadCombo.setVegetables(combo.getVegetables());
                }
            });
        }
        return combos.get(key);
    }
}