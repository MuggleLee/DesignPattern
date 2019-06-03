package Creational.SingletonPattern;

/**
 * 枚举实体类(预加载，线程安全，不受序列化和反射攻击的影响)
 * @author Muggle Lee
 */
public enum EnumSingleton {

    INSTANCE;

    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void show(){
        System.out.println("Hello World !");
    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        enumSingleton.show();
    }
}
