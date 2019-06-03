package Creational.SingletonPattern;

import java.io.Serializable;

/**
 * 饿汉模式(线程安全，预加载)
 * @author Muggle Lee
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        if(hungrySingleton != null){
            throw new RuntimeException("单例模式禁止反射调用！");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
