package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.ConcreteProduct.Media.MediaAirConditioner;
import Creational.AbstractFactory.ConcreteProduct.Media.MediaRefrigerator;
import Creational.AbstractFactory.ConcreteProduct.Media.MediaWashingMachine;
import Creational.AbstractFactory.IElectricAppliance.AirConditioner;
import Creational.AbstractFactory.IElectricAppliance.Refrigerator;
import Creational.AbstractFactory.IElectricAppliance.WashingMachine;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 18:00
 */
public class MediaFactory implements ElectricApplianceFactory {
    @Override
    public AirConditioner getAirConditioner() {
        return new MediaAirConditioner();
    }

    @Override
    public Refrigerator getRefrigerator() {
        return new MediaRefrigerator();
    }

    @Override
    public WashingMachine getWashingMachine() {
        return new MediaWashingMachine();
    }
}
