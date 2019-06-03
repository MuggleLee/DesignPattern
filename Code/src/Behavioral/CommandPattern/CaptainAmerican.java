package Behavioral.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/5/23 10:41
 */
public class CaptainAmerican {

    //保存需要通知的英雄集合
    private List<Hero> list;

    private Command command;

    public CaptainAmerican() {
        this.list = new ArrayList();
    }

    public CaptainAmerican addHero(Hero hero) {
        list.add(hero);
        return this;
    }

    public void notifyAllHero() {
        System.out.println(this.getClass().getSimpleName() + "：Avengers, assemble!");
        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            command = new MessageCommand(hero);
            command.execute();
        }
    }
}
