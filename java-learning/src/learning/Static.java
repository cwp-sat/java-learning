package learning;

//static关键字
public class Static {
    static class Student{
        String name;
        static String school;

        //静态方法（只能访问静态成员）
        public static void printSchool(){
            System.out.println(school);
//            System.out.println(name); 报错，不能直接访问非静态成员
        }
    }
    public static void main(String[] args) {
        Student.school="HPU";
        Student stu1=new Student();
        Student stu2=new Student();
        System.out.println(stu1.school);
        System.out.println(stu2.school);
        stu1.printSchool();
    }
}
