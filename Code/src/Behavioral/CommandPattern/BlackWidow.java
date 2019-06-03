package Behavioral.CommandPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 10:43
 */
public class BlackWidow implements Hero {
    @Override
    public void response() {
        System.out.println(this.getClass().getSimpleName() + "：Yes,Cap!");
    }
}
