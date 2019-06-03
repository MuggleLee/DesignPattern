package Creational.BuilderPattern.Version1;

/**
 * 指挥官
 */
public class Director {

    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public ComputerDIY DIY(String CPU, String mainboard, String memory, String power, String SSD) {
        computerBuilder.buildCPU(CPU);
        computerBuilder.buildSSD(SSD);
        computerBuilder.buildPower(power);
        computerBuilder.buildMainboard(mainboard);
        computerBuilder.buildMemory(memory);
        return computerBuilder.build();
    }
}
