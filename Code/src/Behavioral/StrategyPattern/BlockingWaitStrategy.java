package Behavioral.StrategyPattern;

/**
 * 阻塞等待策略
 */
public class BlockingWaitStrategy implements Strategy{
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName() + "使用锁和条件变量。CPU资源的占用少，延迟大");
    }
}
