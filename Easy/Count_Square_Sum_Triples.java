class Solution {
    public int countTriples(int n) 
    {
        int ans = 0;
        Set<Integer> sq = new HashSet<>();

        for(int i = 1; i<=n; i++)
            sq.add(i*i);

        for(int a : sq)
            for(int b :sq)
                if (sq.contains(a+b))
                    ans++;
            
        return ans;   
    }
}