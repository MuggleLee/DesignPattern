package Behavioral.IteratorPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/21 9:44
 */
public interface Operation {

    void add(Object obj);

    void remove(Object obj);

    MyIterator createIterator();
}
