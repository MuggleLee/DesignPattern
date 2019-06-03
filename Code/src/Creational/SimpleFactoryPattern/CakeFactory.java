package Creational.SimpleFactoryPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/13 9:54
 */
public class CakeFactory {
    public Cake getCake(String cakeName) throws Exception {
          //第一种方式：通过if...else...语句判断
        if ("榴莲蛋糕".equals(cakeName)) {
            return new DurianCake();
        } else if ("草莓蛋糕".equals(cakeName)) {
            return new StrawberryCake();
        } else if ("巧克力蛋糕".equals(cakeName)) {
            return new ChocolateCake();
        } else {
            throw new Exception("输入有误，请重新输入！");
        }

        //第二种方式：通过switch...case...判断
//        switch (cakeName) {
//            case "榴莲蛋糕":
//                return new DurianCake();
//            case "草莓蛋糕":
//                return new StrawberryCake();
//            case "巧克力蛋糕":
//                return new ChocolateCake();
//            default:
//                throw new Exception("输入有误，请重新输入！");
//        }
    }

    //第三种方式：通过反射创建对象
//    public Cake getCake(Class obj){
//        Cake cake = null;
//        try {
//            cake = (Cake) Class.forName(obj.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return cake;
//    }
}
