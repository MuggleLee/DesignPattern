package Structural.CompositePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/6 11:11
 */
public class Test {
    public static void main(String[] args) {
        //共同拥有的部门
        Component department = new Department();
        department.addDepartmentName("人事部");
        department.addDepartmentName("财务部");

        Component companyA = new Company();
        companyA.addCompanyName("北京分公司");
        companyA.getDepartment().addDepartmentName("销售部");
        companyA.addDepartment(department);

        Component companyB = new Company();
        companyB.addCompanyName("广州分公司");
        companyB.getDepartment().addDepartmentName("IT部");
        companyB.getDepartment().addDepartmentName("技术部");
        companyB.addDepartment(department);

        Component companyC = new Company();
        companyC.addCompanyName("香港总公司");
        companyC.getDepartment().addDepartmentName("物流部");
        companyC.addDepartment(department);

        //添加子公司
        companyC.addSubCompany(companyA);
        companyC.addSubCompany(companyB);

        //打印公司结构(展示公司名和部门名)
        companyC.printCompany();
    }
}
