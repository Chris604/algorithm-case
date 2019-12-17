package leet_code;

import java.util.HashMap;
import java.util.Stack;

/**
 * 有效的括号
 */
public class LeetCode20 {


    public static void main(String []args) {
        String s = "{}[](";
        boolean flag = isOrNo(s);

        System.out.println(flag);
    }


    private static boolean isOrNo(String s){

        // 空串为合法串
        if(s.length() == 0 ){
            return true;
        }

        // 字符串为奇数，返回false
        if (s.length()> 0 && s.length()%2 ==1){
            return false;
        }

        Stack S = new Stack();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");

        for (int i =0; i< s.length(); i++) {
            String b = s.substring(i, i+1);

            if (b.equals("(") || b.equals("{") || b.equals("[") ) {
                S.push(b);
            } else {
                if (S.empty()) { return false; }
                String p = (String) S.pop();
                if (!map.get(p).equals(b)) {
                    return false;
                }
            }
        }

        return true;
    }
}
