package fly_weight;

public class FlyWeightRun {
    public static void main(String[] args) {
        BreadComboFlyWeight comboFlyWeight1 = BreadComboFactory.getCombo("coffee", "scrambled eggs", "chicken", "salad");
        BreadComboFlyWeight comboFlyWeight2 = BreadComboFactory.getCombo("tea", "boiled eggs", "chicken", "tomato");
        BreadCombo breadCombo = new BreadCombo();
        comboFlyWeight1.createCombo(breadCombo);
        System.out.println(breadCombo.getString() + " " + breadCombo.getPrice());

        comboFlyWeight2.createCombo(breadCombo);
        System.out.println(breadCombo.getString() + " " + breadCombo.getPrice());
    }
}
