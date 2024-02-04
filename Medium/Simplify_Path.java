class Solution {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        Stack<String> st = new Stack<>();

        for (String S : s) {
            if (S.isEmpty() || S.equals("."))
                continue;

            if (S.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(S);
            }

        }
        return "/" + String.join("/", st);
    }
}