class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> ans = new ArrayList<>();
        dfs(n,n,new StringBuilder(),ans);
        return ans;
    }

    public void dfs(int l, int r , StringBuilder s ,List<String> ans)
    {
        if (l == 0 && r == 0)
        {
            ans.add(s.toString());
            return;
        }

        if (l > 0 )
        {
            s.append("(");
            dfs(l-1,r,s,ans);
            s.deleteCharAt(s.length()-1);
        }
        if (l < r)
        {
             s.append(")");
            dfs(l,r-1,s,ans);
            s.deleteCharAt(s.length()-1);
        }
    }
}