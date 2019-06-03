package Structural.BridgePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/14 11:09
 */
public class Haier extends Brand{

    private final  String name = "海尔";

    public Haier(ElectricAppliance electricAppliance) {
        super(electricAppliance);
    }

    @Override
    public String description() {
        return name + electricAppliance.description();
    }
}
