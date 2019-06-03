package Creational.BuilderPattern.Version2;

/**
 * 组装电脑具体建造者
 */
public class ComputerActualBuilder implements ComputerBuilder {

    ComputerElement computerElement = new ComputerElement();

    @Override
    public ComputerBuilder buildCPU(String CPU) {
        computerElement.setCPU(CPU);
        return this;
    }

    @Override
    public ComputerBuilder buildMainboard(String mainboard) {
        computerElement.setMainboard(mainboard);
        return this;
    }

    @Override
    public ComputerBuilder buildMemory(String memory) {
        computerElement.setMemory(memory);
        return this;
    }

    @Override
    public ComputerBuilder buildSSD(String SSD) {
        computerElement.setSSD(SSD);
        return this;
    }

    @Override
    public ComputerBuilder buildPower(String power) {
        computerElement.setPower(power);
        return this;
    }

    @Override
    public ComputerBuilder buildComputerCase(String computerCase) {
        computerElement.setComputerCase(computerCase);
        return this;
    }

    @Override
    public ComputerElement build() {
        return computerElement;
    }
}
