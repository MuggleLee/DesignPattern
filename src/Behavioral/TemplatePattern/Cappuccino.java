package Behavioral.TemplatePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/20 13:47
 */
public class Cappuccino extends Coffee {

    String coffeeName = "卡布奇诺";

    Coffee make(){
        return super.make(this.coffeeName);
    }

    @Override
    public boolean isAddSugarFlag() {
        return true;
    }
}
