package Creational.BuilderPattern.Version2;

/**
 * @author Muggle Lee
 * @Date: 2019/3/13 16:11
 */
public class ComputerDIY {

    private String CPU;
    private String mainboard;
    private String memory;
    private String SSD;
    private String power;
    private String computerCase;

    public ComputerDIY(ComputerBuilder computerBuilder) {
        this.CPU = computerBuilder.CPU;
        this.mainboard = computerBuilder.mainboard;
        this.memory = computerBuilder.memory;
        this.SSD = computerBuilder.SSD;
        this.power = computerBuilder.power;
        this.computerCase = computerBuilder.computerCase;
    }

    public String diy(){
        final StringBuilder sb = new StringBuilder("电脑配置如下：\n");
        sb.append("     CPU：")
                .append(CPU).append('\n');
        sb.append("     主板:")
                .append(mainboard).append('\n');
        sb.append("     内存：")
                .append(memory).append('\n');
        sb.append("     SSD：")
                .append(SSD).append('\n');
        sb.append("     电源：")
                .append(power).append('\n');
        sb.append("     机箱：")
                .append(computerCase).append('\n');
        sb.append("正在组装中...").append('\n');
        sb.append("组装完成！").append('\n');
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"CPU\":\"")
                .append(CPU).append('\"');
        sb.append(",\"mainboard\":\"")
                .append(mainboard).append('\"');
        sb.append(",\"memory\":\"")
                .append(memory).append('\"');
        sb.append(",\"SSD\":\"")
                .append(SSD).append('\"');
        sb.append(",\"power\":\"")
                .append(power).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public static class ComputerBuilder{
        private String CPU;
        private String mainboard;
        private String memory;
        private String SSD;
        private String power;
        private String computerCase;

        public ComputerBuilder buildCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder buildMainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public ComputerBuilder buildMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public ComputerBuilder buildSSD(String SSD) {
            this.SSD = SSD;
            return this;
        }

        public ComputerBuilder buildPower(String power) {
            this.power = power;
            return this;
        }

        public ComputerBuilder buildComputerCase(String computerCase) {
            this.computerCase = computerCase;
            return this;
        }


        public ComputerDIY build() {
            return new ComputerDIY(this);
        }

    }
}
