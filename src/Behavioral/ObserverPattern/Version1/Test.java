package Behavioral.ObserverPattern.Version1;

import java.math.BigDecimal;

/**
 * @author Muggle Lee
 * @Date: 2019/5/7 16:48
 */
public class Test {
    public static void main(String[] args) {
        Observerable mall = new Mall();
        //添加3个订阅者
        Observer user1 = new User("MuggleLee");
        Observer user2 = new User("Josn");
        Observer user3 = new User("Pakho");
        //注册保存订阅者
        mall.registerObserver(user1);
        mall.registerObserver(user2);
        mall.registerObserver(user3);
        //通知所有的观察者
        mall.notifyObserver("iPhone XR",new BigDecimal(100));

        System.out.println();
        //移除一位订阅者
        mall.removeObserver(user3);
        //通知所有的观察者
        mall.notifyObserver("iPhone XS",new BigDecimal(300));
    }
}
