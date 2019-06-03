package Structural.DecorationPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/4/8 17:54
 */
public class FriedChicken extends Decorator {
    public FriedChicken(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 炸鸡";
    }
}
