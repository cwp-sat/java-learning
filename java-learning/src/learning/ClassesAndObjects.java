package learning;

public class ClassesAndObjects {

    static class Student{
        String name;
        int id;
        double score;
        public Student(String name,int id,double score){
            this.name=name;
            this.id=id;
            this.score=score;
        }
        public void printInfo(){
            System.out.println(name+","+id+","+score);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("张三", 2024001, 88.5);
        Student s2 = new Student("李四", 2024002, 56.6);
        Student s3 = new Student("王五", 2024003, 98.2);
        Student s4 = new Student("老六", 2024004, 87.5);
        Student s5 = new Student("老七", 2024005, 54);
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s4.printInfo();
        s5.printInfo();
    }

}
