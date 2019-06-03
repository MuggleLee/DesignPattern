package Behavioral.StrategyPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/13 14:01
 */
public class Test {
    public static void main(String[] args) {
        ChooseStrategy choose = new ChooseStrategy(new BlockingWaitStrategy());
        choose.getStrategy();
    }
}
