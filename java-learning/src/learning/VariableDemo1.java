package learning;

public class VariableDemo1 {
//    主入口
    public static void main(String[] args) {
//        定义变量
//        数据类型 变量名 = 数据值；
//        数据类型：限定了变量能存储数据的类型
//        整数：byte，short，int，long（后面加L后缀）
//        浮点型：float double
//        字符：char 布尔：boolean
//        变量名：就是存储空间的名字
//        作用：方便以后使用
//        数据值：真正存在变量中的数据
//        等号：赋值 双等号：判断
        int a1=10,a2=20;
        System.out.println(a1);
        double b=1.2;
        System.out.println(b);
        char c='a';
        System.out.println(c);
        boolean d=true;
        System.out.println(d);
//      变量可以参与计算
        System.out.println(a1+a2);
        System.out.println(a1);
//        long（后面加L后缀）
        long i=9999999999L;
        System.out.println(i);
//        float后面也要后缀+F
        float i2=10.23f;
        System.out.println(i2);
//        String字符串
        String name="张三";
        char gender='男';
        int age=22;
        boolean flag=true;
        System.out.println(name+'\t'+gender+'\t'+age+'\t'+flag);

    }
}
