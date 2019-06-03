package Creational.BuilderPattern.Version1;

public class Test {
    public static void main(String[] args) {
        //1.传统的创建对象方式
        ComputerDIY originalObject = new ComputerDIY(
                "Intel酷睿六核处理器i5-8400",
                "Intel B360",
                "16G",
                "1T",
                "美商海盗船");
        System.out.println(originalObject);

        //2.通过建造者模式创建对象
        ComputerBuilder computerBuilder = new ComputerActualBuilder();
        Director director = new Director(computerBuilder);
        ComputerDIY computerDIY = director.DIY(
                "Intel酷睿六核处理器i5-8400",
                "Intel B360",
                "16G",
                "美商海盗船",
                "1T"
        );
        System.out.println(computerDIY);
    }
}
