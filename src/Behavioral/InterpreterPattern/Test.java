package Behavioral.InterpreterPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/21 14:59
 */
public class Test {
    public static void main(String[] args) {
        int result = new Plus().interpret(new Context(10,new Min().interpret(new Context(30,10))));
        System.out.println("10 + （30-10） = " + result);
    }
}
