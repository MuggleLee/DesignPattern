package Creational.SingletonPattern;

/**
 * 懒汉模式(非线程安全，延迟加载)
 *
 * @author Muggle Lee
 * @Date: 2019/3/7 16:34
 */
public class LazySingleton {

    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(lazySingleton);
            }).start();
        }
    }
}

