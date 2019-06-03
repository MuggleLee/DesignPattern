package Behavioral.ObserverPattern.Version2;


import java.util.Observable;

/**
 * @author Muggle Lee
 * @Date: 2019/5/7 16:57
 */
public class Mall extends Observable {

    public final String mallName = "京西";

    public void send(Message message){
        setChanged();//标记被观察者要发生消息
        notifyObservers(message);//通知所有观察者
    }
}
