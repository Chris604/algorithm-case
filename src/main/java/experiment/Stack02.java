package experiment;

import java.util.ArrayList;
import java.util.List;

// 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
public class Stack02 {

    List<Integer> list = new ArrayList<Integer>();
    int size = 0;

    public static void main(String []args){
        Stack02 st = new Stack02();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(1);
//        int top = st.top();
        int top = st.getMin();

        System.out.println(top);

    }

    // 使用集合
    public void push(int x) {
        list.add(x);
        size ++;
    }

    public void pop() {
        if(size == 0) {return;}
        list.remove(size--);
    }

    public int top() {
        if(size == 0) {return 0;}
        return list.get(--size);
    }

    public int getMin() {

        if (size ==0) {return 0;}
        int a = list.get(0);

        for (int i= 0; i < list.size(); i ++){
            a = Math.min(a, list.get(i));
        }

        return a;
    }

}
