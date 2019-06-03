package Structural.DecorationPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/4/8 17:57
 */
public class Test {
    public static void main(String[] args) {
        Food food = new BasicSet();
        Decorator setMealA = new FrenchFries(food);
        setMealA = new FrenchFries(setMealA);
        setMealA = new FriedChicken(setMealA);
        setMealA = new IceCream(setMealA);
        System.out.println("套餐A：" + setMealA.getDescription());
    }
}
