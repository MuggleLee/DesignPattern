package Creational.AbstractFactory.ConcreteProduct.Media;

import Creational.AbstractFactory.IElectricAppliance.Refrigerator;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 17:59
 */
public class MediaRefrigerator implements Refrigerator {
    @Override
    public void produce() {
        System.out.println("制造美的冰箱...");
    }
}
