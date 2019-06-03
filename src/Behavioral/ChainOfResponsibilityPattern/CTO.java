package Behavioral.ChainOfResponsibilityPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/31 17:30
 */
public class CTO extends ReviewPerson{
    private final String NAME = "技术总监";
    @Override
    void handle(String program) {
        if("没有Bug的功能！".equals(program)){
            System.out.println(NAME + "：没问题，提交给老板...");
            getPerson().handle(program);
        }else {
            System.out.println(NAME + "：有Bug呀，再改改！");
        }
    }
}
