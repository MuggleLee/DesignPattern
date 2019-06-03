package Structural.FlyweightPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/4/26 16:18
 */
public class Test {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();

        String fashi = "法师";
        String sheshou = "射手";

        Hero hero1 = heroFactory.factory(fashi);
        hero1.setHeroClass(fashi);
        hero1.setName("王昭君");
        hero1.setAttack(1000);
        hero1.setDefence(100);
        hero1.create();


        Hero hero2 = heroFactory.factory(fashi);
        hero2.setHeroClass(fashi);
        hero2.setName("嬴政");
        hero2.setAttack(1200);
        hero2.setDefence(180);
        hero2.create();


        Hero hero3 = heroFactory.factory(sheshou);
        hero3.setHeroClass(sheshou);
        hero3.setName("后裔");
        hero3.setAttack(1500);
        hero3.setDefence(100);
        hero3.create();

        System.out.println("输出各对象的地址：");
        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);
    }
}
