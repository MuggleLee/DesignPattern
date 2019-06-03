package Behavioral.ObserverPattern.Version2;


import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Muggle Lee
 * @Date: 2019/5/7 16:48
 */
public class Test {
    public static void main(String[] args) {
        Observable mall = new Mall();

        Observer user1 = new User("MuggleLee");
        Observer user2 = new User("Josn");
        Observer user3 = new User("Pakho");

        mall.addObserver(user1);
        mall.addObserver(user2);
        mall.addObserver(user3);

        Message message = new Message("iPhone XR",new BigDecimal(100));

        ((Mall) mall).send(message);

        System.out.println();

        mall.deleteObserver(user3);
        Message message2 = new Message("iPhone XS",new BigDecimal(300));
        ((Mall) mall).send(message2);
    }
}
