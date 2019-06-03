package Behavioral.VisitorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/5/31 14:31
 */
public class StaffContainer {
    private List<Staff> list = new ArrayList<>();

    public void addStaff(Staff staff){
        list.add(staff);
    }
    
    public void accept(Department department){
        Iterator<Staff> it = list.iterator();
        while(it.hasNext()){
            Staff staff = it.next();
            staff.accept(department);
        }
    }
}
