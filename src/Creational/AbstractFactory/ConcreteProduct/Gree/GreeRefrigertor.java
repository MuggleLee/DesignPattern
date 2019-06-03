package Creational.AbstractFactory.ConcreteProduct.Gree;

import Creational.AbstractFactory.IElectricAppliance.Refrigerator;

/**
 * @author Muggle Lee
 * @Date: 2019/5/24 11:10
 */
public class GreeRefrigertor implements Refrigerator {
    @Override
    public void produce() {
        System.out.println("制造格力冰箱...");
    }
}
