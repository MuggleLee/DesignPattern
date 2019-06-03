package Creational.SingletonPattern;

import java.io.Serializable;

/**
 * 声明readResolve()方法，单例对象序列化不受影响
 * @author Muggle Lee
 */
public class SerializableSingleton implements Serializable {
    private final static SerializableSingleton serializableSingleton = new SerializableSingleton();

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return serializableSingleton;
    }

    private Object readResolve() {
        return serializableSingleton;
    }
}
