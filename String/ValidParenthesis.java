package String;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean validParenthesis(String str) {
        int n = str.length();
        if(str.length() == 1) {
            return false;
        }

        Stack<Character> st = new Stack<>();

        for(int i = 0;i<n;i++) {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.isEmpty()) return false;
            

            char top = st.peek();

            if(ch == ')' && top == '(' || ch == ']' && top == '[' || ch == '}' && top == '{') {
                st.pop();
            } else {
                return false;
            }
        }
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "(])";
        System.out.println("Result: " + validParenthesis(str));
    }
}
