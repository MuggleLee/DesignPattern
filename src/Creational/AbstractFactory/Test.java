package Creational.AbstractFactory;

import Creational.AbstractFactory.Factory.GreeFactory;
import Creational.AbstractFactory.Factory.HaierFactory;
import Creational.AbstractFactory.Factory.MediaFactory;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 17:10
 */
public class Test {
    public static void main(String[] args) {
        MediaFactory mediaFactory  = new MediaFactory();
        mediaFactory.getAirConditioner().produce();
        mediaFactory.getRefrigerator().produce();


        HaierFactory haierFactory= new HaierFactory();
        haierFactory.getAirConditioner().produce();
        haierFactory.getRefrigerator().produce();

//        GreeFactory greeFactory = new GreeFactory();
//        greeFactory.getWashingMachine().produce();
    }
}
