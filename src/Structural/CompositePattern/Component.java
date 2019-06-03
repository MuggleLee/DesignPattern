package Structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/5/5 16:34
 */
public abstract class Component {

    public List<String> departmentNameList = new ArrayList();

    //添加

    void addCompanyName(String companyName) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    void addDepartmentName(String departmentName) { throw new UnsupportedOperationException("不支持添加部门操作"); }

    void addSubCompany(Component company) { throw new UnsupportedOperationException("不支持添加操作"); }

    void addDepartment(Component department) {
        throw new UnsupportedOperationException("不支持添加部门操作");
    }


    //获取

    String getCompanyName() { throw new UnsupportedOperationException("不支持获取操作"); }

    List<String> getAllDepartmentName() { throw new UnsupportedOperationException("不支持获取部门操作"); }

    Component getDepartment() {
        throw new UnsupportedOperationException("不支持获取部门操作");
    }

    void printCompany() {
        throw new UnsupportedOperationException("不支持获取操作");
    }
}
