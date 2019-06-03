package Behavioral.VisitorPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/31 10:09
 */
public class AccountingDepartment implements Department{
    private final double MANAGER_DAILY_SALARY = 1000D;

    private final double ENGINEER_DAILY_SALARY = 500D;

    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getStaffName() + " 工程师，月薪为：" + engineer.getWorkTime() * ENGINEER_DAILY_SALARY);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getStaffName() + " 经理，月薪为：" + manager.getWorkTime() * MANAGER_DAILY_SALARY);
    }
}
