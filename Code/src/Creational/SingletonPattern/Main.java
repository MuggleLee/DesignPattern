package Creational.SingletonPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/3/7 16:29
 */
public class Main {
    public static void main(String[] args) {
        new Thread(new ThreadDemo()).start();
        new Thread(new ThreadDemo()).start();
        System.out.println(Thread.currentThread().getName() + "  " + "is Done!" );
    }
}

