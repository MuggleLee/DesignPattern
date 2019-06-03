package Creational.AbstractFactory.ConcreteProduct.Media;

import Creational.AbstractFactory.IElectricAppliance.WashingMachine;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 17:59
 */
public class MediaWashingMachine implements WashingMachine {
    @Override
    public void produce() {
        System.out.println("制造美的洗衣机...");
    }
}
