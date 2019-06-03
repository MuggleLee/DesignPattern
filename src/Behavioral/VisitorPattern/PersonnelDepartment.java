package Behavioral.VisitorPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/31 10:09
 */
public class PersonnelDepartment implements Department {
    @Override
    public void visit(Engineer engineer) {
        engineer.setWorkTime(workTime());
        System.out.println(engineer.getStaffName() + " 工程师，上个月工作天数为：" + workTime());
    }

    @Override
    public void visit(Manager manager) {
        manager.setWorkTime(workTime());
        System.out.println(manager.getStaffName() + " 经理，上个月工作天数为：" + workTime());
    }

    //默认所有人都工作22天
    double workTime(){
        return 22;
    }
}
