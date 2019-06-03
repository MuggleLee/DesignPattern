package Behavioral.ObserverPattern.Version1;

import java.math.BigDecimal;

/**
 * @author Muggle Lee
 * @Date: 2019/5/7 16:57
 */
public class Mall implements Observerable {

    private final String mallName = "京西";

    //通知所有观察者
    @Override
    public void notifyObserver(String product, BigDecimal money) {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(mallName, product, money);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }
}
