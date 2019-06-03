package Behavioral.StatePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/29 17:19
 */
public class Apply {
    public static void main(String[] args){
        try {
            //下属申请
            System.out.println("提交申请...");
            Context context  = new Context(new Audit());
            context.audit();
            Thread.sleep(100);
            //模拟上级看到申请后的动作
            context.pass();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
