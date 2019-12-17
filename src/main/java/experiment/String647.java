package experiment;

// 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
public class String647 {

    public static void main(String[] args){
        String s = "abcbac";
        int flag = countSubstrings(s);
//        int flag = countSubstrings1(s);
        System.out.println(flag);
    }


    // 遍历，以每个为中心向两边判断
    public static int countSubstrings1(String s) {
        if (s == null) { return 0; }
        int count=s.length();
        int left;
        int right;
        for (int i=0; i < s.length(); i++){
            left = i;
            right = i+1;
            while (left>0 && right < s.length() && s.charAt(--left) == s.charAt(right++)){
                count ++;
            }
        }

        return count;
    }





    // 两重 for 循环
    public static int countSubstrings(String s) {
        if (s == null){ return 0; }
        int count=1;
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<= s.length(); j++){
                String ss = s.substring(i, j);
                if (isSubString(ss)){
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isSubString(String s){
        if (s == null){ return false; }
        for (int i=0; i<s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
