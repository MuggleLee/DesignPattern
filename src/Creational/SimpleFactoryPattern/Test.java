package Creational.SimpleFactoryPattern;


import com.sun.deploy.util.StringUtils;

/**
 * @author Muggle Lee
 * @Date: 2019/5/13 10:02
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //第一种、第二种方式的测试代码
        String cakeName = "榴莲蛋糕";
        CakeFactory cake = new CakeFactory();
        cake.getCake(cakeName).produce();
        //第三种的测试代码
//        CakeFactory cakeFactory = new CakeFactory();
//        cakeFactory.getCake(DurianCake.class).produce();
    }
}
