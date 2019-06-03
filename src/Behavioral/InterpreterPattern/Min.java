package Behavioral.InterpreterPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/21 17:07
 */
public class Min implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNumber1()-context.getNumber2();
    }
}
