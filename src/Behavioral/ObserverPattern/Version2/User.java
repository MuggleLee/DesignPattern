package Behavioral.ObserverPattern.Version2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Muggle Lee
 * @Date: 2019/5/7 16:52
 */
public class User implements Observer {

    private String userName;

    public User(String name) {
        this.userName = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Mall mall = (Mall) o;
        Message message = (Message) arg;
        System.out.println(userName + "接收到一条来自" + mall.mallName + "的消息：您关注的商品‘"
                + message.getProductName() + "'降价了！比您加入购物车的时候降了" + message.getMoney() + "元！");
    }
}
