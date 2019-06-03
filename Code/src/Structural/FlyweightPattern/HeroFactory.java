package Structural.FlyweightPattern;

import java.util.HashMap;

/**
 * @author Muggle Lee
 * @Date: 2019/4/26 14:51
 */
public class HeroFactory {

    public HashMap<String,Hero> map = new HashMap();

    public Hero factory(String heroClass){
        Hero hero = map.get(heroClass);
        if(hero == null){
            hero = new Hero();
            map.put(heroClass,hero);
        }
        return hero;
    }
}
