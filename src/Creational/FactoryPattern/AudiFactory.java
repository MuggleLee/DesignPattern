package Creational.FactoryPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/9 10:04
 */
public class AudiFactory extends CarFactory {
    @Override
    Car getCar() {
        return new Audi();
    }
}
