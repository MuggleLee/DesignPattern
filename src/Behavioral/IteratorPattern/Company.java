package Behavioral.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/5/21 9:45
 */
public class Company implements Operation {

    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public MyIterator createIterator() {
        return new ListMyIterator(this.list);
    }
}
