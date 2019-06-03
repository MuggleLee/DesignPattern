package Creational.FactoryPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/9 9:43
 */
public class BenzFactory extends CarFactory{
    @Override
    Car getCar() {
        return new Benz();
    }
}
