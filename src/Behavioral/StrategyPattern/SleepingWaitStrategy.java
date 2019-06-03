package Behavioral.StrategyPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/13 14:08
 */
public class SleepingWaitStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName() + "在多次循环尝试不成功后，选择让出CPU，等待下次调度，多次调度后仍不成功，尝试前睡眠一个纳秒级别的时间再尝试。这种策略平衡了延迟和CPU资源占用，但延迟不均匀");
    }
}
