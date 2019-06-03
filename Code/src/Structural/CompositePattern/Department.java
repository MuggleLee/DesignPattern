package Structural.CompositePattern;

import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/5/6 10:32
 */
public class Department extends Component {

    //添加部门名字
    @Override
    void addDepartmentName(String departmentName) { departmentNameList.add(departmentName); }

    //获取全部部门名字
    @Override
    List<String> getAllDepartmentName() { return departmentNameList; }
}
