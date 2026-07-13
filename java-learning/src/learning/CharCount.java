package learning;

import java.util.HashMap;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            Integer count=map.getOrDefault(String.valueOf(str.charAt(i)),0);
            map.put(String.valueOf(str.charAt(i)),count+1);
        }
        for (String key:map.keySet() ){
            System.out.println(key+" "+map.get(key));
        }
    }
}
