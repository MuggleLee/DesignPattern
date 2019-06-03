package Structural.AdapterPattern.ObjectAdapter;

/**
 * @author Muggle Lee
 * @Date: 2019/4/30 15:00
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void targetMethod() {
        adaptee.adapteeMethod();
    }
}
