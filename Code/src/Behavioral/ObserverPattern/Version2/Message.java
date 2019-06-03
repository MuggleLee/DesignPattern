package Behavioral.ObserverPattern.Version2;

import java.math.BigDecimal;

/**
 * @author Muggle Lee
 * @Date: 2019/5/7 17:44
 */
public class Message {
    private String productName;
    private BigDecimal money;

    public Message() {
    }

    public Message(String productName, BigDecimal money) {
        this.productName = productName;
        this.money = money;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getMoney() {
        return money;
    }
}
