package Creational.SingletonPattern;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Muggle Lee
 * @Date: 2019/4/24 11:02
 */
public class SingletonByCAS {

    private static AtomicReference<SingletonByCAS> INSTANCE = new AtomicReference();

    public SingletonByCAS() {
    }


    public static SingletonByCAS getInstance() {
        SingletonByCAS singletonByCAS = INSTANCE.get();
        for (; ; ) {
            if (singletonByCAS != null) {
                return singletonByCAS;
            }
            singletonByCAS = new SingletonByCAS();
            if (INSTANCE.compareAndSet(null, singletonByCAS)) {
                return singletonByCAS;
            }
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonByCAS singletonByCAS = SingletonByCAS.getInstance();
                System.out.println(singletonByCAS);
            }).start();
        }

    }
}
