package learning;

public class StringStudy {

    public static void main(String[] args) {
        String str = "Hello World";
        //1.获取长度
        int len=str.length();
        System.out.println(len);
        //2.比较内容
        boolean isEqual=str.equals("Hello World");
        System.out.println(isEqual);
        //3.获取某个位置的字符
        char ch=str.charAt(1);
        System.out.println(ch);
        //4.查找子串位置（首次出现）
        int idx=str.indexOf("World");
        int idx2=str.indexOf("x");
        System.out.println(idx+" "+idx2);
        //5.截取子串
        String sub1=str.substring(6);//“world”从索引6到末尾
        String sub2=str.substring(0,5);//”Hello“（从0到4，不含5）
        System.out.println(sub1+" "+sub2);
        //6.替换
        String replaced=str.replace("World","Java");
        System.out.println(replaced);
        //7.分割
        String str2="apple,banana,orange";
        String[] parts=str2.split(",");
        //增强for循环遍历数组
        //for(元素类型 临时变量 : 数组/集合){操作临时变量}
        for(String part:parts){
            System.out.print(part+" ");
        }
        System.out.println();
        //8.检查是否包含
        boolean contians=str.contains("World");
        System.out.println(contians);
        //9.去除首尾空格
        String str3=" Hello ";
        String trimmed=str3.trim();
        System.out.println(trimmed);
        //10.转大小写
        String upper=str.toUpperCase();
        String lower=str.toLowerCase();
        System.out.println(upper+" "+lower);
        //StringBuilder常用方法
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("World");
        sb.insert(5,",");
        sb.delete(5,6);
        sb.reverse();//反转
        String result=sb.toString();//转为string
        System.out.println(result);
    }
}
