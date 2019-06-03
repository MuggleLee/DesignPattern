package Behavioral.CommandPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 10:42
 */
public class IronMan implements Hero{
    @Override
    public void response() {
        System.out.println(this.getClass().getSimpleName() + "：Yes,Cap!");
    }
}
