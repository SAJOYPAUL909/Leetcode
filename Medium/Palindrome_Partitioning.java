class Solution {
    public List<List<String>> partition(String s) 
    {
        List<List<String>> ans = new ArrayList<>();
        dfs(s,0,new ArrayList<>(),ans);
        return ans;
    }

    public void dfs(String s , int st , List<String> temp,List<List<String>> ans)
    {
        if (st == s.length())
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = st ; i < s.length() ; i++)
        {
            if(isPalin(s,st,i))
            {
                temp.add(s.substring(st,i+1));
                dfs(s,i+1,temp,ans);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean  isPalin(String s , int l , int r)
    {
            while(l < r)
            {
                if (s.charAt(l++) != s.charAt(r--))
                    return false;
            }
            return true;
    }



}