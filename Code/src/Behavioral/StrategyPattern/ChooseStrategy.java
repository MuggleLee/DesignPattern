package Behavioral.StrategyPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/13 14:15
 */
public class ChooseStrategy {
    private Strategy strategy;

    public ChooseStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void getStrategy(){
        strategy.doSomething();
    }
}
