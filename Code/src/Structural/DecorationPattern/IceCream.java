package Structural.DecorationPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/4/11 10:05
 */
public class IceCream extends Decorator {

    public IceCream(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 冰淇淋";
    }
}
