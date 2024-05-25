class Solution {
    public int minOperations(int[] nums) 
    {
        int ans = 0;
        Map<Integer,Integer> count =new HashMap<>();
          
        for(int n : nums)
        {
            count.merge(n,1,Integer::sum);
        }

        for (int f: count.values())
        {
            if (f == 1)
                return -1;
            ans += (f+2) /3;
        }
        return ans;
    }
}