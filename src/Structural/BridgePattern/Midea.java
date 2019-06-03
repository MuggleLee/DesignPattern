package Structural.BridgePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/14 11:08
 */
public class Midea extends Brand{

    private final  String name = "美的";

    public Midea(ElectricAppliance electricAppliance) {
        super(electricAppliance);
    }

    @Override
    public String description() {
        return name + electricAppliance.description();
    }
}
