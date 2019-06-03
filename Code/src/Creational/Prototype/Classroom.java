package Creational.Prototype;

/**
 * 班级
 * @author Muggle Lee
 * @Date: 2019/4/4 14:28
 */
public class Classroom implements Cloneable{

    private String className;

    public Classroom() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"ClassName\":\"")
                .append(className).append('\"');
        sb.append('}').append(super.toString());
        return sb.toString();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
