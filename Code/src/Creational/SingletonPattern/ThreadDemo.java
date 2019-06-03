package Creational.SingletonPattern;

/**
 * @author Muggle Lee
 */
public class ThreadDemo implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + lazySingleton);
    }
}
