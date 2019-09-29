package leet_code;

/* 无重复字符的最长子串 */
public class LeetCode3 {

    public static void main(String []art) {
        String s = "abdcadd";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    private static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] tmp = new int[256];
        int maxlen = 0;
        int l = 0;
        int r = 0;

        while (l < s.length()) {
            char c = s.charAt(r);
            if (r < s.length() && tmp[s.charAt(r)] == 0) {
                tmp[s.charAt(r++)] = 1;
            } else {
                maxlen = maxlen > (r - l) ? maxlen : (r - l);

                tmp[s.charAt(l++)] = 0;

            }
        }

        return maxlen;
    }
}
