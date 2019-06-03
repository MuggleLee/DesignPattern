package Behavioral.TemplatePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/17 17:41
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("******  下订单：一杯加糖,不加奶的热卡布奇诺  ******");
        Cappuccino cappuccino = new Cappuccino();
        cappuccino.make();
        System.out.println("******  下订单：一杯加糖,加奶的热拿铁  ******");
        Latte latte = new Latte();
        latte.make();
    }
}
