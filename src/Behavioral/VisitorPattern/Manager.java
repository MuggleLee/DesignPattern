package Behavioral.VisitorPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/31 10:17
 */
public class Manager implements Staff {

    private String staffName;

    private double workTime;

    public Manager(String staffName) {
        this.staffName = staffName;
    }


    @Override
    public void accept(Department department) {
        department.visit(this);
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }
}
