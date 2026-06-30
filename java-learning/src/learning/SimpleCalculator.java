package learning;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number：");
        double num1 = sc.nextDouble();
        System.out.println("choose + - * /");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter second number：");
        double num2 = sc.nextDouble();
        if(ch1=='+'){
            System.out.println("answer is "+(num1+num2));
        }
        else if (ch1=='-') {
            System.out.println("answer is "+(num1-num2));
        }
        else if (ch1=='*') {
            System.out.println("answer is "+(num1*num2));
        }
        else if (ch1 == '/') {
            if (num2 == 0){
                System.out.println("除数不能为0");
            }else
                System.out.println("answer is "+(num1/num2));
        }
    }
}

