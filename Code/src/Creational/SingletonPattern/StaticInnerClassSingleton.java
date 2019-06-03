package Creational.SingletonPattern;

import java.io.Serializable;

/**
 * 静态内部类单例对象(线程安全，预加载)
 * @author Muggle Lee
 * @Date: 2019/3/11 14:13
 */
public class StaticInnerClassSingleton implements Serializable{
    private StaticInnerClassSingleton() {
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }
}
