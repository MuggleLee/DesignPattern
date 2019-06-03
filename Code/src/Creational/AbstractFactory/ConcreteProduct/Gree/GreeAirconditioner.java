package Creational.AbstractFactory.ConcreteProduct.Gree;

import Creational.AbstractFactory.IElectricAppliance.AirConditioner;

/**
 * @author Muggle Lee
 * @Date: 2019/5/24 11:10
 */
public class GreeAirconditioner implements AirConditioner {
    @Override
    public void produce() {
        System.out.println("制造格力空调...");
    }
}
