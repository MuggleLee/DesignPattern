package Creational.BuilderPattern.Version2;

/**
 * @author Muggle Lee
 * @Date: 2019/3/13 16:16
 */
public class Test {
    public static void main(String[] args) {
        ComputerDIY computerDIY = new ComputerDIY.ComputerBuilder()
                .buildCPU("Intel酷睿六核处理器i5-8400")
                .buildMainboard("Intel B360")
                .buildMemory("16G")
                .buildSSD("16G")
                .buildPower("美商海盗船")
                .buildComputerCase("普通机箱")
                .build();
        System.out.println(computerDIY.diy());


        ComputerDirector director = new ComputerDirector();
        System.out.println(director.build("Intel酷睿六核处理器i5-8400","Intel B360","16G","1T","美商海盗船","普通机箱"));



    }
}