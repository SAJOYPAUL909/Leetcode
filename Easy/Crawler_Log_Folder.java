class Solution {
    public int minOperations(String[] logs) 
    {
        int count = 0;
        for(String s: logs)
        {
            if (s.equals("../"))
                count = Math.max(0, count-1);
            else if (s.equals("./"))
                continue;
            else
                count++;    
            
        }
            return count;
        
    }
}