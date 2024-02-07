import java.util.Stack;

class Solution {
    public int calculate(String s) {
        int ans = 0;
        int n = 0;
        int sign = 1;

        Stack<Integer> st = new Stack<>();
        st.push(sign);

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '(')
                st.push(sign);
            else if (c == ')')
                st.pop();
            else if (c == '+' || c == '-') {
                ans += sign * n;
                if (c == '+')
                    sign = 1 * st.peek();
                else
                    sign = -1 * st.peek();
                n = 0;
            }
        }
        return ans + (sign * n);
    }
}