package Creational.AbstractFactory.ConcreteProduct.Gree;

import Creational.AbstractFactory.IElectricAppliance.WashingMachine;

/**
 * @author Muggle Lee
 * @Date: 2019/5/24 11:11
 */
public class GreeWashingMachine implements WashingMachine {
    @Override
    public void produce() {
        System.out.println("制造格力洗衣机...");
    }
}
