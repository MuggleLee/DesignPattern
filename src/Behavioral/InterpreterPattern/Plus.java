package Behavioral.InterpreterPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/21 17:06
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNumber1() + context.getNumber2();
    }
}
