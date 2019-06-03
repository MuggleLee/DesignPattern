package Creational.Prototype;

/**
 * 学生类
 *
 * @author Muggle Lee
 * @Date: 2019/4/4 14:26
 */
public class Student implements Cloneable {
    private String name;
    private Integer age;
    private Classroom classroom;

    public Student() {
        System.out.println("Student类的无参构造器...");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"Name\":\"")
                .append(name).append('\"');
        sb.append(",\"Age\":")
                .append(age);
        sb.append(",\"Classroom\":")
                .append(classroom);
        sb.append('}').append("    ").append(super.toString());
        return sb.toString();
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.setClassroom((Classroom) student.classroom.clone());
        return student;
    }
}


