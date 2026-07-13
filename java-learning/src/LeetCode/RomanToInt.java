package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an roman number: ");
        String str = sc.nextLine();
        Solution solution=new Solution();
        int sum=solution.romanToInt(str);
        System.out.println(sum);
    }
    static int getValue(char ch){
        switch(ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
            }
    }
    static class Solution {
        public int romanToInt(String s) {
//            HashMap<Character, Integer> map = new HashMap<>();
//            map.put('I',1);
//            map.put('V',5);
//            map.put('X',10);
//            map.put('L',50);
//            map.put('C',100);
//            map.put('D',500);
//            map.put('M',1000);
//            int sum=0;
//            for (int i = 0; i < s.length(); i++) {
//                //若是最后一个，直接加上
//                if (i<(s.length()-1)&&map.get(s.charAt(i))<map.get(s.charAt(i+1))){
//                    sum-=map.get(s.charAt(i));
//                }
//                else {
//                    sum+=map.get(s.charAt(i));
//                }
//            }
//            return sum;
            int sum=0;
            for (int i = 0; i < s.length(); i++) {
                if(i+1<s.length()&&getValue(s.charAt(i))<getValue(s.charAt(i+1))){
                    sum-=getValue(s.charAt(i));
                }else{
                    sum+=getValue(s.charAt(i));
                }
            }
            return sum;
        }
    }
}
