package Behavioral.StatePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/29 17:17
 */
public abstract class FlowState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    abstract void audit();

    abstract void pass();

    abstract void noPass();
}
