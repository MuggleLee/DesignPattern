package Creational.BuilderPattern.Version2;

/**
 * 指挥官
 */
public class ComputerDirector {

    private ComputerBuilder computerBuilder = new ComputerActualBuilder();

    public ComputerElement build(String CPU, String mainboard, String memory, String SSD, String power, String computerCase) {
        return computerBuilder.buildMainboard(mainboard)
                .buildCPU(CPU)
                .buildSSD(SSD)
                .buildMemory(memory)
                .buildPower(power)
                .buildComputerCase(computerCase)
                .build();
    }

}
