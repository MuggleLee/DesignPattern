package Behavioral.IteratorPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/21 9:52
 */
public class Management implements Operation {

    static final Integer MAX_LENGTH = 100;

    private Object[] array = new Object[MAX_LENGTH];

    private int index = -1;

    @Override
    public void add(Object obj) {
        ++index;
        if(index != MAX_LENGTH){
            array[index] = obj;
        }else {
            System.out.println("达到容器最大长度！");
        }
    }

    @Override
    public void remove(Object obj) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(obj)){
                array[i] = "";
            }
        }
    }

    @Override
    public MyIterator createIterator() {
        return new ArrayMyIterator(array);
    }
}
