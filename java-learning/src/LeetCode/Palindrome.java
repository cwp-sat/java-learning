package LeetCode;

import java.util.ArrayList;

public class Palindrome {
    class Solution {
        public boolean isPalindrome(int x) {
//            if(x<0) return false;
//            if(x==0) return true;
//            ArrayList<Integer> list = new ArrayList<>();
//            while (x>0){
//                list.add(x%10);
//                x/=10;
//            }
//            for (int i = 0; i < list.size()/2; i++) {
//                if(list.get(i)!=list.get(list.size()-1-i))
//                    return false;
//            }
//            return true;
            String str=String.valueOf(x);
            int left=0,right=str.length()-1;
            while (left<right){
                if(str.charAt(left)!=str.charAt(right))
                    return false;
                left++;
                right--;
            }
            return true;
        }
    }
}
