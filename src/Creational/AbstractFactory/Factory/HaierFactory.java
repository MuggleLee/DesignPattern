package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.ConcreteProduct.Haier.HaierAirConditioner;
import Creational.AbstractFactory.ConcreteProduct.Haier.HaierRefrigerator;
import Creational.AbstractFactory.ConcreteProduct.Haier.HaierWashingMachine;
import Creational.AbstractFactory.IElectricAppliance.AirConditioner;
import Creational.AbstractFactory.IElectricAppliance.Refrigerator;
import Creational.AbstractFactory.IElectricAppliance.WashingMachine;

/**
 * @author Muggle Lee
 * @Date: 2019/5/24 11:13
 */
public class HaierFactory implements ElectricApplianceFactory {
    @Override
    public AirConditioner getAirConditioner() {
        return new HaierAirConditioner();
    }

    @Override
    public Refrigerator getRefrigerator() {
        return new HaierRefrigerator();
    }

    @Override
    public WashingMachine getWashingMachine() {
        return new HaierWashingMachine();
    }
}
