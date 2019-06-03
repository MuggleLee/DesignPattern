package Structural.BridgePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/14 11:31
 */
public class AirConditioner implements ElectricAppliance {

    private final String name = "空调";

    @Override
    public String description() {
        return name;
    }
}
