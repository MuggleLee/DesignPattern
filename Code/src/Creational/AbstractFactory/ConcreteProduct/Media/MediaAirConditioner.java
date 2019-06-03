package Creational.AbstractFactory.ConcreteProduct.Media;

import Creational.AbstractFactory.IElectricAppliance.AirConditioner;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 17:58
 */
public class MediaAirConditioner implements AirConditioner {
    @Override
    public void produce() {
        System.out.println("制造美的空调...");
    }
}
