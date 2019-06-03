package Creational.BuilderPattern.Version1;

/**
 * 组装电脑抽象建造者
 */
public abstract class ComputerBuilder {

    public abstract void buildCPU(String CPU);

    public abstract void buildMainboard(String mainboard);

    public abstract void buildMemory(String memory);

    public abstract void buildSSD(String SSD);

    public abstract void buildPower(String power);

    public abstract ComputerDIY build();

}
