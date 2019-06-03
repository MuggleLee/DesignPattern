package Creational.SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Muggle Lee
 */
public class ReflectTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //饿汉模式
        HungrySingleton instance = HungrySingleton.getInstance();

        Class reflectObject = HungrySingleton.class;
        //获取类的构造器
        Constructor constructor = reflectObject.getDeclaredConstructor();
        //设置在使用构造器的时候不执行权限检查
        constructor.setAccessible(true);
        //通过调用无参构造函数创建对象
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }

}
