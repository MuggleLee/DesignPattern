package Creational.SingletonPattern;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author Muggle Lee
 * @Date: 2019/3/8 9:42
 */
public class SerializableSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        EnumSingleton instance = EnumSingleton.getInstance();

        Class reflectClass = EnumSingleton.class;

        //例子1：测试序列化、反序列化是否能破坏枚举单例模式
        String fileName = "SingletonTest";
        //写文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(instance);
        File file = new File(fileName);
        //读文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumSingleton newInstance = (EnumSingleton) ois.readObject();
        System.out.println(instance == newInstance);

        //例子2：通过反射调用EnumSingleton无参构造器,测试是否能破坏枚举单例模式
        Constructor constructor = null;
        try {
            constructor = reflectClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            EnumSingleton newInstance2 = (EnumSingleton) constructor.newInstance();
            System.out.println(instance == newInstance2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //例子3：通过反射调用EnumSingleton有参构造器,测试是否能破坏枚举单例模式
        Constructor constructor2 = null;
        try {
            constructor2 = reflectClass.getDeclaredConstructor(String.class, int.class);
            constructor2.setAccessible(true);
            EnumSingleton newInstance3 = (EnumSingleton) constructor2.newInstance("MuggleLee", 22);
            System.out.println(instance == newInstance3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
