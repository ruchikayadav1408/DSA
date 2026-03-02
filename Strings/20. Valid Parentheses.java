import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket, push
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // If closing bracket arrives with empty stack -> invalid
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();
                // If matching pair, pop; else invalid
                if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        // Valid only if no unmatched openings remain
        return st.isEmpty();
    }
}
