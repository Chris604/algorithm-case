package experiment;

import java.util.Collection;
import java.util.HashMap;

// 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
public class Sort02 {

    public static void main(String []args){
        String s = "abc";
        String t = "ba";
        boolean flag = isAnagram(s, t);
        System.out.println(flag);
    }

    // 暴力对比
    public static boolean isAnagram(String s, String t) {
        char[] sValues = s.toCharArray();
        char[] tValues = t.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (char sValue:sValues){
            if (map1.get(sValue)!= null && map1.get(sValue) !=0){
                map1.put(sValue, map1.get(sValue) + 1);
            } else {
                map1.put(sValue, 1);
            }
        }

        for (char tValue:tValues){
            if (map1.get(tValue) == 0){
                return false;
            }
            map1.put(tValue, map1.get(tValue) - 1);
        }

        Collection<Integer> values = map1.values();
        for (Integer value:values){
            if (value != 0){
                return false;
            }
        }

        return true;
    }


    // 使用 hash 表进行计算
    private static boolean isAnagram1(String s, String t){if (s.length() != t.length()) {
        return false;
    }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
