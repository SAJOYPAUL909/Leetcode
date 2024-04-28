class Solution {
    public int findRotateSteps(String ring, String key) 
    {
        Map <String,Integer> map = new HashMap<>();
        return dfs (ring,key,0,map) + key.length();   
    }
    public int dfs(String ring , String Key, int index, Map<String,Integer> map)
    {
        if (index == Key.length())
            return 0;

        String Hashkey = ring + index;
        if (map.containsKey(Hashkey))
            return map.get(Hashkey);

        int ans = Integer.MAX_VALUE;

        for (int i =0 ; i < ring.length() ;i++)
        {
            if (ring.charAt(i) == Key.charAt(index))
            {
            int min = Math.min(i,ring.length()-i);
            String newring = ring.substring(i) +ring.substring(0,i);
            int remaining = dfs(newring,Key,index+1,map);
            ans = Math.min(ans,min+remaining);
            }
        
        map.put(Hashkey,ans);
        }
        return ans;
    }
}