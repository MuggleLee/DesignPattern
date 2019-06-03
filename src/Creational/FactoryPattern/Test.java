package Creational.FactoryPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/8 14:36
 */
public class Test {
    public static void main(String[] args) {
        //制造奔驰
        CarFactory benzFactory = new BenzFactory();
        benzFactory.getCar().produce();

        //制造宝马
        CarFactory bmwFactory = new BmwFactory();
        bmwFactory.getCar().produce();

        //制造奥迪
        CarFactory audiFactory = new AudiFactory();
        audiFactory.getCar().produce();
    }
}
