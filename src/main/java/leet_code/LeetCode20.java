package leet_code;

/**
 * 有效的括号
 */
public class LeetCode20 {


    private static boolean isOrNo(String s){

        // 空串为合法串
        if(s.length() == 0 ){
            return true;
        }

        // 字符串为奇数，返回false
        if (s.length()> 0 && s.length()%2 ==1){
            return false;
        }



        return false;
    }
}
