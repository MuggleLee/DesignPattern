package Structural.BridgePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/14 11:31
 */
public class WashingMachine implements ElectricAppliance {

    private final String name = "洗衣机";

    @Override
    public String description() {
        return name;
    }
}
