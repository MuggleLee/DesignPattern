package Structural.BridgePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/14 16:19
 */
public class WaterHeater implements ElectricAppliance {

    private final String name = "热水器";

    @Override
    public String description() {
        return name;
    }
}
