package Creational.BuilderPattern.Version1;

/**
 * 组装电脑具体建造者
 */
public class ComputerActualBuilder extends ComputerBuilder {

    private ComputerDIY computerDIY = new ComputerDIY();

    @Override
    public void buildCPU(String CPU) {
        computerDIY.setCPU(CPU);
    }

    @Override
    public void buildMainboard(String mainboard) {
        computerDIY.setMainboard(mainboard);
    }

    @Override
    public void buildMemory(String memory) {
        computerDIY.setMemory(memory);
    }

    @Override
    public void buildSSD(String SSD) {
        computerDIY.setSSD(SSD);
    }

    @Override
    public void buildPower(String power) {
        computerDIY.setPower(power);
    }

    @Override
    public ComputerDIY build() {
        return computerDIY;
    }
}
