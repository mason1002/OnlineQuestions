/*
     Author:Mason
     2018/12/16 20:19
*/

import java.util.Stack;

public class ValidParentheses {


    public static boolean isValid(String s) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == '(' && s.charAt(i + 1) == '(') ||
                    (ch == '[' && s.charAt(i + 1) == '[')) {
                return false;
            }
            if (ch == '(' || ch == ')' || ch == '[' || ch == ']' || ch == '{'
                    || ch == '}') {
                newStr.append(ch);
            }
//            System.out.println(newStr);
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < newStr.length(); i++) {
            char ch = newStr.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (ch == ')' && topChar != '(') {
                    return false;
                } else if (ch == ']' && topChar != '[') {
                    return false;
                } else if (ch == '}' && topChar != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[(2+3)*(1-3)] + 4}*(14-3)";
//        String s = "{[()()]}()";
        boolean a = isValid(s);
        System.out.println(a);
    }
}