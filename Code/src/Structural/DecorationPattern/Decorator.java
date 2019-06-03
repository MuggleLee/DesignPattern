package Structural.DecorationPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/4/10 17:42
 */
public abstract class Decorator implements Food {

    private Food food;

    public Decorator(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return this.food.getDescription();
    }

}
