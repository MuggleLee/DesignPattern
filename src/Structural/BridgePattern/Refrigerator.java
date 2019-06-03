package Structural.BridgePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/14 11:30
 */
public class Refrigerator implements ElectricAppliance{

    private final String name = "冰箱";

    @Override
    public String description() {
        return name;
    }
}
