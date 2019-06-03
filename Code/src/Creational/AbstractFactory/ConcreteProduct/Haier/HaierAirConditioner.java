package Creational.AbstractFactory.ConcreteProduct.Haier;

import Creational.AbstractFactory.IElectricAppliance.AirConditioner;

/**
 * @author Muggle Lee
 * @Date: 2019/5/24 11:09
 */
public class HaierAirConditioner implements AirConditioner {
    @Override
    public void produce() {
        System.out.println("制造海尔空调...");
    }
}
