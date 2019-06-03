package Creational.FactoryPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/9 9:46
 */
public class BmwFactory extends CarFactory {
    @Override
    Car getCar() {
        return new Bmw();
    }
}
