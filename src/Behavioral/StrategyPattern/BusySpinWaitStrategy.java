package Behavioral.StrategyPattern;

/**
 * 自旋等待策略
 */
public class BusySpinWaitStrategy  implements Strategy{
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName() + "自旋等待，类似Linux Kernel使用的自旋锁。低延迟但同时对CPU资源的占用也多");
    }
}
