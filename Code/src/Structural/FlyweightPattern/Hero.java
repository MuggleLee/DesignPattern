package Structural.FlyweightPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/4/26 14:44
 */
public class Hero{

    private String heroClass;//英雄职业

    private String name;

    private long attack;//攻击力

    private long defence;//防御力

    public Hero() {
    }


    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public long getAttack() {
        return attack;
    }

    public void setAttack(long attack) {
        this.attack = attack;
    }

    public long getDefence() {
        return defence;
    }

    public void setDefence(long defence) {
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void create() {
        System.out.println("职业：" + this.getHeroClass() + "\n"
                + "创建的角色：" + this.getName() + "\n"
                + "角色属性：" + "\n"
                + "攻击力：" + this.getAttack() + "\n"
                + "防御力：" + this.getDefence() + "\n");
    }
}
