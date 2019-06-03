package Behavioral.IteratorPattern;

import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/5/20 17:50
 */
public class ListMyIterator implements MyIterator {

    private List list;

    private Integer index = -1;

    public ListMyIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return list.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if(index < list.size()-1){
            return true;
        }else{
            return false;
        }
    }
}
