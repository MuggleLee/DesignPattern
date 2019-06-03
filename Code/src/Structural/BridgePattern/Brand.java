package Structural.BridgePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/14 11:06
 */
public abstract class Brand {

    protected ElectricAppliance electricAppliance;

    public Brand(ElectricAppliance electricAppliance) {
        this.electricAppliance = electricAppliance;
    }

    abstract String description();
}
