package Creational.BuilderPattern.Version2;

/**
 * 组装电脑抽象建造者
 */
public interface ComputerBuilder {
    ComputerBuilder buildCPU(String CPU);

    ComputerBuilder buildMainboard(String mainboard);

    ComputerBuilder buildMemory(String memory);

    ComputerBuilder buildSSD(String SSD);

    ComputerBuilder buildPower(String power);

    ComputerBuilder buildComputerCase(String computerCase);

    ComputerElement build();
}
