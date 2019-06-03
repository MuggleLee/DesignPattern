package Behavioral.StatePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/29 17:16
 */
public class Context {

    protected FlowState state;
    protected static final Audit AUDIT = new Audit();
    protected static final NoPass NO_PASS = new NoPass();
    protected static final Pass PASS = new Pass();

    public Context(FlowState state) {
        setState(state);
    }

    public FlowState getState() {
        return state;
    }

    public void setState(FlowState state) {
        this.state = state;
        this.state.setContext(this);
    }

    void audit(){
        this.getState().audit();
    }

    void pass(){
        this.getState().pass();
    }

    void noPass(){
        this.getState().noPass();
    }
}
