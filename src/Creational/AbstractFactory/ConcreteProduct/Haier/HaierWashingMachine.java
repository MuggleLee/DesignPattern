package Creational.AbstractFactory.ConcreteProduct.Haier;

import Creational.AbstractFactory.IElectricAppliance.WashingMachine;

/**
 * @author Muggle Lee
 * @Date: 2019/5/24 11:10
 */
public class HaierWashingMachine implements WashingMachine {
    @Override
    public void produce() {
        System.out.println("制造海尔洗衣机...");
    }
}
