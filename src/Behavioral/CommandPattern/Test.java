package Behavioral.CommandPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 10:38
 */
public class Test {
    public static void main(String[] args) {
        CaptainAmerican captainAmerican = new CaptainAmerican();
        Thor thor = new Thor();
        BlackWidow blackWidow = new BlackWidow();
        Hawkeye hawkeye = new Hawkeye();
        Hulk hulk = new Hulk();
        IronMan ironMan = new IronMan();

        captainAmerican.addHero(thor)
                .addHero(blackWidow)
                .addHero(hawkeye)
                .addHero(hulk)
                .addHero(ironMan);

        captainAmerican.notifyAllHero();
    }
}
