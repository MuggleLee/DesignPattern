package Behavioral.ChainOfResponsibilityPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/31 17:30
 */
public class Boss extends ReviewPerson{

    private final String NAME = "老板";

    @Override
    void handle(String program) {
        if("没有Bug的功能！".equals(program)){
            System.out.println(NAME + "：功能完成，可以上线了！");
        }else {
            System.out.println(NAME + "：有Bug呀，再改改！");
        }
    }
}
