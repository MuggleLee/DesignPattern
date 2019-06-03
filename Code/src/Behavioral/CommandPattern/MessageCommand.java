package Behavioral.CommandPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 15:13
 */
public class MessageCommand implements Command {

    public Hero hero;

    public MessageCommand() {}

    public MessageCommand(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void execute() {
        hero.response();
    }
}
