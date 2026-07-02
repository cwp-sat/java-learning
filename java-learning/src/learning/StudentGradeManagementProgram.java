package learning;

import java.util.Arrays;
import java.util.Scanner;

//--- 学生成绩管理系统 ---
//1. 录入成绩
//2. 查看所有成绩
//3. 查看平均分
//4. 查看最高分
//5. 成绩排序（从高到低）
//0. 退出
//
//请选择操作：1
//请输入第 1 个学生的成绩：85
//请输入第 2 个学生的成绩：92
//        ...（直到录满）
//
//请选择操作：3
//平均分是：78.5 分
public class StudentGradeManagementProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_SIZE = 99;
        double []arr1=new double[MAX_SIZE];//存放学生成绩
        int count=0;
        double max=-1;//学生人数,最高分，总分,平均分
        System.out.println("--- 学生成绩管理系统 ---\n" +
                "1. 录入成绩\n" +
                "2. 查看所有成绩\n" +
                "3. 查看平均分\n" +
                "4. 查看最高分\n" +
                "5. 成绩排序（从高到低）\n" +
                "0. 退出");
        while (true) {
            System.out.println("请选择操作：");
            int n=sc.nextInt();
            if (n==0){
                System.out.print("系统已退出");
                break;
            }
            if(count==0&&n!=1){
                System.out.println("暂无学生成绩，请先选择1录入成绩");
                continue;
            }
            //录入成绩
            if (n==1){
                if (count > 0) {
                    System.out.print("已有 " + count + " 名学生成绩，是否重新录入？(y/n)：");
                    char choice1 = sc.next().charAt(0);
                    if (choice1 == 'y' || choice1 == 'Y') {
                        for (int i = 0; i < count; i++) {
                            arr1[i]=0;
                        }//选择重新录入时，清空成绩
                        count = 0;  // 清空
                        max = -1;
                    } else if(choice1 == 'n' || choice1 == 'N'){
                        System.out.print("已有 " + count + " 名学生成绩，是否继续录入第"+(count+1)+"名学生成绩？(y/n)：");
                        char choice2 = sc.next().charAt(0);
                        if (choice2 == 'n' || choice2 == 'N'){
                            continue;
                        }
                    }
                }
                int i=count;
                while (i<MAX_SIZE){
                    System.out.print("请输入第 "+(i+1)+" 个学生的成绩(输入-1退出)：");
                    double score=sc.nextDouble();
                    if (score==-1){
                        count=i;
                        break;
                    }
                    if(score>100||score<0){
                        System.out.println("输入分数不规范");
                        continue;
                    }
                    arr1[i]=score;
                    if(arr1[i]>max) max=arr1[i];
                    i++;
                }
                if(i==MAX_SIZE){
                    System.out.println("已达到最大录入人数" + MAX_SIZE + "，停止录入");
                    count=MAX_SIZE;
                }
            }
            //查看成绩
            if (n==2){
                for (int i=0;i<count;i++){
                    System.out.println("第"+(i+1)+"个学生的成绩是"+arr1[i]);
                }
            }
            //查看平均分
            if (n==3){
                double sum=0,avr;
                for (int i=0;i<count;i++) sum+=arr1[i];
                avr=sum/count;
                System.out.println("学生平均数为："+avr);
            }
            //查看最高分
            if (n==4)System.out.println("学生最高分为："+max);
            //查看成绩排序
            if (n==5){
                double []arr2= Arrays.copyOf(arr1,count);
                double temp;
                for (int i=0;i<count-1;i++){
                    for (int j=count-1;j>i;j--){
                        if(arr2[j]>arr2[j-1]){
                            temp=arr2[j];
                            arr2[j]=arr2[j-1];
                            arr2[j-1]=temp;
                        }
                    }
                }
                System.out.println("学生成绩排序（从高到低）：");
                for (int i=0;i<count;i++){
                    System.out.println(arr2[i]);
                }
            }
        }
    }
}
