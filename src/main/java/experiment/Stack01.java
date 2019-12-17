package experiment;

import java.util.Stack;

// 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
public class Stack01 {

    public static void main(String []args){
        String s = "((()))";

        boolean valid = isValid(s);

        System.out.print(valid);
    }

    // 使用栈 stack
    public static boolean isValid(String s) {

        Stack<String> cs = new Stack<String>();

        for (int i= 0; i< s.length(); i++){

            if ("(".equals(String.valueOf(s.charAt(i))) || "{".equals(String.valueOf(s.charAt(i))) || "[".equals(String.valueOf(s.charAt(i)))){
                cs.push(String.valueOf(s.charAt(i)));
            } else {
                if(cs.size() == 0){
                    return false;
                }

                String b = cs.pop() + s.charAt(i);
                if(!b.equals("()") && !b.equals("[]") && !b.equals("{}")){
                    return false;
                }
            }
        }

        if(cs.size() == 0){
            return true;
        }

        return false;
    }
}
