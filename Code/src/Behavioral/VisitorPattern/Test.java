package Behavioral.VisitorPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/30 16:37
 */
public class Test {
    public static void main(String[] args) {
        Staff engineer = new Engineer("Marry");
        Staff manager = new Manager("Tim");
        Department personnelDepartment = new PersonnelDepartment();
        Department accountingDepartment = new AccountingDepartment();
        StaffContainer container = new StaffContainer();
        container.addStaff(engineer);
        container.addStaff(manager);
        System.out.println("----------人事部统计员工上班天数----------");
        container.accept(personnelDepartment);
        System.out.println("----------财务部计算员工工资----------");
        container.accept(accountingDepartment);
    }
}
