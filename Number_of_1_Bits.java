class Solution {
    public int hammingWeight(long n) {
        int ans = 0;

    for (int i = 0; i < 32; ++i)
      if (((n >> i) & 1) == 1)
        ans++;

    return ans;
   
    }
}   