class Solution {
    public long wonderfulSubstrings(String word) 
    {
        long ans = 0;
        int p = 0;
        int count[] = new int[1024];
        count[0] = 1;

        for (char c :word.toCharArray())
        {
            p ^= 1 << c - 'a';
            ans += count[p];

            for (int i = 0 ; i < 10 ; i++)
                ans+= count[p ^ 1 << i];
            count[p]++;
        }
        return ans;
    }
}