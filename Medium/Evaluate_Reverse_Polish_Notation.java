import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String s = "";
        int a, b;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] != "+" && tokens[i] != "-"
                    && tokens[i] != "*" && tokens[i] != "/") {
                st.push(Integer.parseInt(tokens[i]));
            } else {
                s = tokens[i];
            }

            switch (s) {
                case "+":
                    a = st.pop();
                    b = st.pop();
                    st.push(a + b);
                    break;

                case "-":
                    a = st.pop();
                    b = st.pop();
                    st.push(b - a);
                    break;

                case "*":
                    a = st.pop();
                    b = st.pop();
                    st.push(a * b);
                    break;

                case "/":
                    a = st.pop();
                    b = st.pop();
                    st.push(b / a);
                    break;

                default:
                    continue;
            }
        }

        return st.pop();
    }
}