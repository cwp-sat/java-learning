package learning;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        // 1. 定义文章
        String text = "Hello world. This is a test. Hello again!";
        // 2. 清洗文本：去掉标点符号，统一转小写
        //    提示：用 replace() 去掉 . , ! ? ; : 等
        String replacedText=text.replaceAll("[^a-zA-Z]"," ").toLowerCase();
        // 3. 分割成单词数组：用 split(" ")
        // 4. 用 HashMap<String, Integer> 统计每个单词出现次数
        //    遍历数组，对每个单词：如果 map 中没有 → 放入 1，有 → 值 + 1
        TreeMap<String,Integer>map=new TreeMap<>();
        for (String word : replacedText.split(" ")) {
            if (!word.isEmpty())
            map.put(word,map.getOrDefault(word,0)+1);
        }
        // 5. 遍历打印结果
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

    }
}