package Behavioral.TemplatePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/20 13:36
 */
public abstract class Coffee {

    boolean addSugarFlag = false;

    boolean addMilkFlag = false;

    public boolean isAddMilkFlag() {
        return addMilkFlag;
    }

    public boolean isAddSugarFlag() {
        return addSugarFlag;
    }

    Coffee prepareHotWater(){
        System.out.println("准备热水");
        return this;
    }

    Coffee grindCoffeeBean(){
        System.out.println("研磨咖啡豆");
        return this;
    }

    void addSugar(){
        System.out.println("加糖");
    }

    void addMilk(){
        System.out.println("加奶");
    }

    Coffee make(String coffeeName){
        Coffee coffee = prepareHotWater().grindCoffeeBean();
        if(isAddMilkFlag()){
            coffee.addMilk();
        }
        if(isAddSugarFlag()){
            coffee.addSugar();
        }
        System.out.println("制作完成！这是一杯"
                + (isAddSugarFlag() ? "加" : "不加") + "糖,"
                + (isAddMilkFlag() ? "加" : "不加") + "奶"
                + "的" + coffeeName);
        return coffee;
    }
}
