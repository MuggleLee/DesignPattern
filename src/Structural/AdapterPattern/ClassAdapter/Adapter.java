package Structural.AdapterPattern.ClassAdapter;

/**
 * @author Muggle Lee
 * @Date: 2019/4/30 14:50
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void targetMethod() {
        super.adapteeMethod();
    }
}
