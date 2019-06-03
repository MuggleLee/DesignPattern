package Behavioral.ObserverPattern.Version1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/5/7 16:50
 */
public interface Observerable {
    List<Observer> list = new ArrayList<>();

    void notifyObserver(String product, BigDecimal money);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);
}
