package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println("请输入数字:(按回车结束) ");
        while(true){
            String line=sc.nextLine();
            if(line.isEmpty())break;
            int num=Integer.parseInt(line);
            list.add(num);
        }
        System.out.println("请输入目标数字：");
        int target=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<list.size();i++){
            for (int j = i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    flag=true;
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
        if(!flag){
            System.out.println("没有合适的答案");
        }

    }
}
