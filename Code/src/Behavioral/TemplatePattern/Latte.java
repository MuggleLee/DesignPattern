package Behavioral.TemplatePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/20 13:51
 */
public class Latte extends Coffee {
    String coffeeName = "拿铁";

    Coffee make(){
        return super.make(this.coffeeName);
    }

    @Override
    public boolean isAddMilkFlag() {
        return true;
    }

    @Override
    public boolean isAddSugarFlag() {
        return true;
    }
}
