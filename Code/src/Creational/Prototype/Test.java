package Creational.Prototype;

/**
 * @author Muggle Lee
 * @Date: 2019/4/4 14:47
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student();
        Classroom classroom = new Classroom();
        classroom.setClassName("高三<7>班");
        student1.setName("Jone");
        student1.setAge(20);
        student1.setClassroom(classroom);
        Student student2 = (Student) student1.clone();
        Student student3 = (Student) student1.clone();

        //先观察clone出来的对象地址
        System.out.println("各个对象的地址");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());


        System.out.println("修改student2和student3的属性");
        student2.setName("Marry");
        student2.setAge(18);
        student3.setName("Stan");
        student3.setAge(19);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("Marry被调到高三<1>班");
        student2.getClassroom().setClassName("高三<1>班");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }

}
