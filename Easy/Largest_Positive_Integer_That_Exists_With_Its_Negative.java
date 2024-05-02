class Solution {
    public int findMaxK(int[] nums) 
    {
        int ans = -1;
        Set<Integer> set = new HashSet<>();

        for (int i : nums)
        {
            if (set.contains(-i))
                ans = Math.max(ans,Math.abs(i));
            else
                set.add(i);
        }
        return ans;
    }
}