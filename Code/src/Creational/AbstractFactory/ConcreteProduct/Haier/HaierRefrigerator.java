package Creational.AbstractFactory.ConcreteProduct.Haier;

import Creational.AbstractFactory.IElectricAppliance.Refrigerator;

/**
 * @author Muggle Lee
 * @Date: 2019/5/24 11:09
 */
public class HaierRefrigerator implements Refrigerator {
    @Override
    public void produce() {
        System.out.println("制造海尔冰箱...");
    }
}
