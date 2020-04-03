package word21;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int ret=stack.pop();
        System.out.println(ret);
        ret=stack.pop();
        System.out.println(ret);
        ret=stack.pop();
        System.out.println(ret);
        ret=stack.pop();
        System.out.println(ret);
       // ret=stack.pop();
       // System.out.println(ret);//错误
    }
}
