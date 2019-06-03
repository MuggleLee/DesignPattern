package Behavioral.ChainOfResponsibilityPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/31 17:29
 */
public class Tester extends ReviewPerson{
    private final String NAME = "测试人员";
    @Override
    void handle(String program) {
        if("没有Bug的功能！".equals(program)){
            System.out.println(NAME + "：没问题，提交给技术总监...");
            getPerson().handle(program);
        }else {
            System.out.println(NAME + "：有Bug呀，再改改！");
        }
    }
}
