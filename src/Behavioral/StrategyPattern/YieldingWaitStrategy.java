package Behavioral.StrategyPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/13 14:09
 */
public class YieldingWaitStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName() + " 在多次循环尝试不成功后，选择让出CPU，等待下次调。平衡了延迟和CPU资源占用，但延迟也比较均匀");
    }
}
