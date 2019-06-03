package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.ConcreteProduct.Gree.GreeAirconditioner;
import Creational.AbstractFactory.ConcreteProduct.Gree.GreeRefrigertor;
import Creational.AbstractFactory.ConcreteProduct.Gree.GreeWashingMachine;
import Creational.AbstractFactory.ConcreteProduct.Haier.HaierAirConditioner;
import Creational.AbstractFactory.ConcreteProduct.Haier.HaierRefrigerator;
import Creational.AbstractFactory.ConcreteProduct.Haier.HaierWashingMachine;
import Creational.AbstractFactory.IElectricAppliance.AirConditioner;
import Creational.AbstractFactory.IElectricAppliance.Refrigerator;
import Creational.AbstractFactory.IElectricAppliance.WashingMachine;

/**
 * @author Muggle Lee
 * @Date: 2019/5/24 11:14
 */
public class GreeFactory implements ElectricApplianceFactory {
    @Override
    public AirConditioner getAirConditioner() {
        return new GreeAirconditioner();
    }

    @Override
    public Refrigerator getRefrigerator() {
        return new GreeRefrigertor();
    }

    @Override
    public WashingMachine getWashingMachine() {
        return new GreeWashingMachine();
    }
}
