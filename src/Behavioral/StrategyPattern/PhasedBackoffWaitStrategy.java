package Behavioral.StrategyPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/13 14:09
 */
public class PhasedBackoffWaitStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName() + "多种策略的综合，CPU资源的占用少，延迟大");
    }
}
