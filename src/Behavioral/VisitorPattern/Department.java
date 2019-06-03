package Behavioral.VisitorPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/30 16:38
 */
public interface Department {
    void visit(Engineer engineer);

    void visit(Manager manager);
}
