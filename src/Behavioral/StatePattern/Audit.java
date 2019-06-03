package Behavioral.StatePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/29 17:19
 */
public class Audit extends FlowState{
    @Override
    void audit() {
        System.out.println("审核中...");
    }

    @Override
    void pass() {
        super.context.setState(Context.PASS);
        super.context.getState().pass();
    }

    @Override
    void noPass() {
        super.context.setState(Context.NO_PASS);
        super.context.getState().noPass();
    }
}
