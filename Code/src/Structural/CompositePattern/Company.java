package Structural.CompositePattern;

import java.util.*;

/**
 * @author Muggle Lee
 * @Date: 2019/5/6 10:36
 */
public class Company extends Component {

    private String companyName;

    private List<Component> companyList = new ArrayList();

    private Department department = new Department();

    private HashMap<Company, List<Component>> subCompanyMap = new HashMap();//子公司集合


    //添加公司名字
    @Override
    void addCompanyName(String companyName) { this.companyName = companyName; }


    //添加部门对象
    @Override
    void addDepartment(Component department) {
        List<String> departmentNameList = department.getAllDepartmentName();
        Component dept = this.getDepartment();
        for (int i = 0; i < departmentNameList.size(); i++) {
            dept.departmentNameList.add(departmentNameList.get(i));
        }
    }

    //添加子公司对象
    @Override
    void addSubCompany(Component company) {
        companyList.add(company);
        subCompanyMap.put(this, companyList);
    }

    //获取公司名字
    @Override
    String getCompanyName() { return this.companyName; }

    //获取公司部门
    @Override
    Component getDepartment() { return department; }

    //打印公司结构
    @Override
    void printCompany() {
        Set<Company> set = subCompanyMap.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Company company = (Company) it.next();
            System.out.println(company.companyName);//输出总公司名字
            List<String> departmentList = company.getDepartment().departmentNameList;
            //第二层：显示总公司部门
            for (int i = 0; i < departmentList.size(); i++) {
                String departmentName = departmentList.get(i);
                System.out.println("    " + departmentName);
            }
            //第二层：显示分公司名字，第三层：显示子公司部门
            List<Component> subCompanyList = subCompanyMap.get(company);
            for (int i = 0; i < subCompanyList.size(); i++) {
                Component subCompany = subCompanyList.get(i);
                System.out.println("    " + subCompany.getCompanyName());
                List<String> subDepartmentList = subCompany.getDepartment().departmentNameList;
                for (int j = 0; j < subDepartmentList.size(); j++) {
                    System.out.println("        " + subDepartmentList.get(j));
                }
            }
        }
    }
}
