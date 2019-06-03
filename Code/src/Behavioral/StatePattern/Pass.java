package Behavioral.StatePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/29 17:19
 */
public class Pass extends FlowState{

    @Override
    void audit() {
        super.context.setState(Context.AUDIT);
        super.context.getState().audit();
    }

    @Override
    void pass() {
        System.out.println("通过啦...");
    }

    @Override
    void noPass() {
        super.context.setState(Context.NO_PASS);
        super.context.getState().noPass();
    }
}
