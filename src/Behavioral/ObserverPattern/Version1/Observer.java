package Behavioral.ObserverPattern.Version1;

import java.math.BigDecimal;

/**
 * @author Muggle Lee
 * @Date: 2019/5/7 16:50
 */
public interface Observer {
    void update(String mallName,String product, BigDecimal money);
}
