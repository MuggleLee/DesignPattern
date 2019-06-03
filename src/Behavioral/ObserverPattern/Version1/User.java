package Behavioral.ObserverPattern.Version1;

import java.math.BigDecimal;

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
    public void update(String mallName, String product, BigDecimal money) {
        System.out.println(userName + "接收到一条来自" + mallName + "的消息：您关注的商品【" + product + "】降价了！比您加入购物车的时候降了" + money + "元！");
    }
}
