package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.IElectricAppliance.AirConditioner;
import Creational.AbstractFactory.IElectricAppliance.Refrigerator;
import Creational.AbstractFactory.IElectricAppliance.WashingMachine;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 17:40
 */
public interface ElectricApplianceFactory {
    AirConditioner getAirConditioner();

    Refrigerator getRefrigerator();

    WashingMachine getWashingMachine();
}
