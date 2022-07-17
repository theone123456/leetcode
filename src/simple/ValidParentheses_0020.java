package simple;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 给定一个只包括'(' ')' '[' ']' '{' '}'的字符串s，判断字符串是否有效
 *
 * 左括号必须用相同类型的右括号闭合
 * 左括号必须以正确的顺序闭合
 */

public class ValidParentheses_0020 {
    public static void main(String[] args) {
        String s = "{[]}[]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Set<Character> right = new HashSet<>();
        right.add(')');
        right.add(']');
        right.add('}');
        char[] parentheses = s.toCharArray();
        for (char parenthesis : parentheses) {
            stack1.push(parenthesis);
        }
        while (!stack1.empty()){
            Character bracket = stack1.pop();
            if (right.contains(bracket) || stack2.empty()){
                stack2.push(bracket);
            }else {
                if (bracket == '(' && ')' == stack2.peek()){
                    stack2.pop();
                }else if (bracket == '[' && ']' == stack2.peek()){
                    stack2.pop();
                }else if (bracket == '{' && '}' == stack2.peek()){
                    stack2.pop();
                }else {
                    stack2.push(bracket);
                }
            }
        }
        return stack2.empty();
    }
}
