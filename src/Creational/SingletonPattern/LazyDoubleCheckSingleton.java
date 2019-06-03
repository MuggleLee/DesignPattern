package Creational.SingletonPattern;

/**
 * 懒汉模式双重检查(线程安全，延迟加载)
 * @author Muggle Lee
 */
public class LazyDoubleCheckSingleton {

    //由于会发生重排序的情况，所以使用volatile保证创建LazyDoubleCheckSingleton实例不会发生重排序。
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
