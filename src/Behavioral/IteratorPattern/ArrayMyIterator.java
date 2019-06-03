package Behavioral.IteratorPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/21 10:00
 */
public class ArrayMyIterator implements MyIterator{

    Object[] obj ;

    private Integer index = -1;

    public ArrayMyIterator(Object[] obj) {
        this.obj = obj;
    }

    @Override
    public Object next() {
        Object object = obj[++index];
        if(object != null){
            return object;
        }
       return "";
    }

    @Override
    public boolean hasNext() {
        return index < obj.length-1;
    }
}
