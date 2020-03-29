package word18;

import java.util.Stack;

public class TestStackAndQueue {
    public boolean isValid(String s){
        //创建一个栈，栈中保存字符类型
        Stack<Character> stack=new Stack<>();
        //循环遍历字符串中的每个字符
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //判定c是否是左括号，若是就入栈
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
                continue;//进入下次循环，取出下一个字符
            }
            if(stack.empty()){
                //若当前字符不是左括号，栈又为空，此时字符串非法
                //说明。前面没有合适的左括号与当前括号匹配
                return false;
            }
            //判定c是否是右括号，若是就取出栈顶元素对比一下
            char top=stack.pop();
            if(top=='('&&c==')'){
                continue;
            }
            if(top=='['&&c==']'){
                continue;
            }
            if(top=='{'&&c=='}'){
                continue;
            }
            //除以上三种其余均为非法情况
            return false;
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}
