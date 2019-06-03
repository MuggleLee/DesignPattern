package Behavioral.ChainOfResponsibilityPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/31 17:29
 */
public class Programmer {
    public static void main(String[] args) {
        ReviewPerson tester = new Tester();
        ReviewPerson cto = new CTO();
        ReviewPerson boss = new Boss();

        tester.setPerson(cto);
        cto.setPerson(boss);

        tester.handle("没有Bug的功能！");
    }
}
